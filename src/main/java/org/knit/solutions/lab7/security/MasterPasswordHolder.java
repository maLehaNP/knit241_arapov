package org.knit.solutions.lab7.security;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Slf4j
@Component
public class MasterPasswordHolder {
    private char[] masterPassword;

    public MasterPasswordHolder() {
        setMasterPassword();
    }

    public void setMasterPassword() {
        System.out.print("Введите мастер-пароль: ");
        Scanner scanner = new Scanner(System.in);
        this.masterPassword = System.console() != null
                ? System.console().readPassword()
                : scanner.nextLine().toCharArray();
        log.info("Пользователь ввел мастер-пароль");
    }

    public char[] getMasterPassword() {
        return masterPassword;
    }

    public void clear() {
        masterPassword = null;
    }
}
