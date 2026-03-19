package com.example.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.contact.model.Contact;
import com.example.contact.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    public Contact add(@RequestBody Contact c) {
        return service.addContact(c);
    }

    @GetMapping
    public List<Contact> getAll() {
        return service.getAllContacts();
    }

    @GetMapping("/name/{name}")
    public List<Contact> getByName(@PathVariable String name) {
        return service.getByName(name);
    }

   @DeleteMapping("/name/{name}")
public String deleteByName(@PathVariable String name) {
    service.deleteByName(name);
    return "Contact Deleted Successfully";
}
}