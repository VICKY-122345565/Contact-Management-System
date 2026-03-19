package com.example.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.example.contact.model.Contact;

@Transactional
public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByName(String name);

    void deleteByName(String name);
}