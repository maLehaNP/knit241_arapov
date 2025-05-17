package org.knit.solutions.lab7.crypto;

public interface EncryptionService {
    String encrypt(String input);

    String decrypt(String cipherText);
}
