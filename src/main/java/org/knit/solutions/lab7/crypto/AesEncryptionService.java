package org.knit.solutions.lab7.crypto;

import org.knit.solutions.lab7.security.MasterPasswordHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;
import java.util.Random;

@Service
public class AesEncryptionService implements EncryptionService {
    MasterPasswordHolder holder;
    SecretKey key;
    IvParameterSpec ivParameterSpec = generateIv();

    @Autowired
    public AesEncryptionService(MasterPasswordHolder masterPasswordHolder) {
        this.holder = masterPasswordHolder;
        this.key = getKeyFromPassword(String.valueOf(holder.getMasterPassword()));
    }

    //    AES/CBC/PKCS5Padding
    //    PBKDF2WithHmacSHA256
    private SecretKey getKeyFromPassword(String password) {
        try {
            String salt = String.valueOf(new Random().nextInt());
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);
            return new SecretKeySpec(factory.generateSecret(spec).getEncoded(), "AES");
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    public String encrypt(String input) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, key, ivParameterSpec);
            byte[] cipherText = cipher.doFinal(input.getBytes());
            return Base64.getEncoder().encodeToString(cipherText);
        } catch (NoSuchAlgorithmException | BadPaddingException | NoSuchPaddingException |
                 InvalidAlgorithmParameterException | InvalidKeyException | IllegalBlockSizeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String decrypt(String cipherText) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, key, ivParameterSpec);
            byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            return new String(plainText);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidAlgorithmParameterException |
                 InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
