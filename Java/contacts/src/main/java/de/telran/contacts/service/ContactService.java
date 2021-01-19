package de.telran.contacts.service;

import de.telran.contacts.model.Contact;
import de.telran.contacts.repository.IContentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    IContentRepo contactRepo;

    public ContactService(IContentRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public void create(Contact contact) {
        contactRepo.save(contact);
    }

    public void edit(Contact contact) {
        contactRepo.save(contact);
    }

    public Contact remove(int id) {
        return contactRepo.remove(id);

    }

    public Contact get(int id) {
        return contactRepo.find(id);
    }


    public List<Contact> getAll() {
        return contactRepo.findAll();
    }

}
