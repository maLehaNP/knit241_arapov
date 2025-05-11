package org.knit.solutions.lab7.model;

import lombok.Getter;

import java.util.Objects;

@Getter
public class PasswordEntry {
    private final String site;
    private final String login;
    private final String encryptedPassword;

    public PasswordEntry(String site, String login, String encryptedPassword) {
        this.site = site;
        this.login = login;
        this.encryptedPassword = encryptedPassword;
    }

    @Override
    public int hashCode() {
        return Objects.hash(site, login, encryptedPassword);
    }
}
