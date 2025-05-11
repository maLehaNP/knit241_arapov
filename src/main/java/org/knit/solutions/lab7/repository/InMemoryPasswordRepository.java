package org.knit.solutions.lab7.repository;

import org.knit.solutions.lab7.model.PasswordEntry;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class InMemoryPasswordRepository implements PasswordRepository {
    @Override
    public void addEntry(PasswordEntry entry) {
        repository.put(entry.getSite(), entry);
    }

    @Override
    public void deleteEntry(String site) {
        repository.remove(site);
    }

    @Override
    public PasswordEntry getEntry(String site) {
        System.out.println("Запрашиваемый сайт: " + site);
        return repository.get(site);
    }

    @Override
    public Collection<PasswordEntry> entries() {
        return repository.values();
    }
}
