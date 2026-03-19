package com.example.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.contact.model.Contact;
import com.example.contact.repository.ContactRepository;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repo;

    public Contact addContact(Contact c) {
        return repo.save(c);
    }

    public List<Contact> getAllContacts() {
        return repo.findAll();
    }

    public List<Contact> getByName(String name) {
        return repo.findByName(name);
    }

    public void deleteByName(String name) {
    repo.deleteByName(name);
}
}