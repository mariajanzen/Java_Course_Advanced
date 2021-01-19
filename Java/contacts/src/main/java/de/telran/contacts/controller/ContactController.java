package de.telran.contacts.controller;

import de.telran.contacts.model.Contact;
import de.telran.contacts.service.ContactService;
import org.apache.tomcat.util.modeler.BaseAttributeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    ContactService contactService;

    @GetMapping("/contacts")
    public String getAll(Model model) {
       // List<Contact> contacts = contactService.getAll();

        List<Contact> contacts = Arrays.asList(
                new Contact(1, "Vasya", "Vasin", 20),
                new Contact(1, "Petya", "Petin", 22)
        );
        model.addAttribute("contactList", contacts);
        return "contacts";
    }
}
