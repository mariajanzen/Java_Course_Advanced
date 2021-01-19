package de.telran.contacts.repository;

import de.telran.contacts.model.Contact;

import java.util.List;

public interface IContentRepo {

    void save(Contact contact);

    Contact find(int id);

    Contact remove(int id);

    List<Contact> findAll();

}
