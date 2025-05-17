package org.knit.solutions.lab7.repository;

import org.knit.solutions.lab7.model.PasswordEntry;

import java.util.Collection;
import java.util.HashMap;

public interface PasswordRepository {
    HashMap<String, PasswordEntry> repository = new HashMap<>();

    void addEntry(PasswordEntry entry);

    void deleteEntry(String site);

    PasswordEntry getEntry(String site);

    Collection<PasswordEntry> entries();
}
