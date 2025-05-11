package org.knit.solutions.lab7.service;

import org.knit.solutions.lab7.clipboard.SystemClipboardService;
import org.knit.solutions.lab7.crypto.AesEncryptionService;
import org.knit.solutions.lab7.model.PasswordEntry;
import org.knit.solutions.lab7.repository.InMemoryPasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.lang.System.exit;

@Service
public class PasswordService {
    InMemoryPasswordRepository repository;
    SystemClipboardService clipboard;
    AesEncryptionService encryption;

    @Autowired
    public PasswordService(InMemoryPasswordRepository repository, SystemClipboardService clipboard, AesEncryptionService encryption) {
        this.repository = repository;
        this.clipboard = clipboard;
        this.encryption = encryption;
    }

    public void add(String site, String login, String password) {
        repository.addEntry(new PasswordEntry(site, login, encryption.encrypt(password)));
    }

    public void list() {
        int k = 1;
        System.out.println("|  №  |         Site         |         Login         | Password |");
        System.out.println("|-----|----------------------|-----------------------|----------|");
        for (PasswordEntry entry : repository.entries()) {
            System.out.printf("| %3d | %-20s | %-21s | ******** |%n", k, entry.getSite(), entry.getLogin());
            k++;
        }
    }

    public void copy(String site) {
        try {
            clipboard.copyToClipboard(encryption.decrypt(repository.getEntry(site).getEncryptedPassword()));
        } catch (NullPointerException e) {
            System.out.println("Такого сайта нет.");
        }
    }

    public void delete(String site) {
        repository.deleteEntry(site);
    }

    public void exitProgram() {
        exit(1);
    }
}
