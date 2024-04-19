package com.example.ContactList.controller;

import com.example.ContactList.model.Contact;
import com.example.ContactList.repository.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    private final ContactRepository repository;

    public ContactController(ContactRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String listContacts(Model model) {
        model.addAttribute("contacts", repository.findAll());
        return "contacts";
    }

    @GetMapping("/contacts/new")
    public String showAddContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "edit";
    }

    @PostMapping("/save")
    public String saveContact(@ModelAttribute("contact") Contact contact) {
        if (contact.getId() == null) {
            repository.save(contact);
        } else {
            repository.update(contact);
        }
        return "redirect:/";
    }

    @GetMapping("/contacts/delete/{id}")
    public String deleteContact(@PathVariable("id") Long id) {
        repository.delete(id);
        return "redirect:/";
    }
    @GetMapping("/contacts/edit/{id}")
    public String editContact(@PathVariable("id") Long id, Model model) {
        Contact contact = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid contact Id:" + id));
        model.addAttribute("contact", contact);
        return "edit";
    }
    @GetMapping("/contacts")
    public String contacts() {
        return "redirect:/";
    }
}
