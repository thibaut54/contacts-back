package org.thibaut.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.thibaut.dao.ContactRepository;
import org.thibaut.entities.Contact;
import org.thibaut.exception.ContactNotFoundException;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ContactRestService {

	@Autowired
	private ContactRepository contactRepository;

	@GetMapping("/contacts")
	public List< Contact > getContacts(){
		return contactRepository.findAll();
	}

	@GetMapping("/findContacts")
	public Page<Contact> findContacts(
			@RequestParam(name = "nom", defaultValue = "") String nom,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "5") int size){
		return contactRepository.chercherContact( "%"+nom+"%", PageRequest.of( page, size ) );
	}

	@GetMapping("/contacts/{id}")
	public Contact getContact( @PathVariable Long id){
		return contactRepository.findById( id ).orElseThrow( ()-> new ContactNotFoundException( id ) );
	}

	@PostMapping("/contacts")
	public Contact saveContact( @RequestBody Contact contact){
		return contactRepository.save( contact );
	}

	@PutMapping("/contacts/{id}")
	public Contact updateContact(@PathVariable Long id, @RequestBody Contact contact){
		contact.setId( id );
		return contactRepository.save( contact );
	}

	@DeleteMapping("/contacts/{id}")
	public boolean deleteContact( @PathVariable Long id){
		try {
			contactRepository.deleteById( id );
		} catch ( ContactNotFoundException e ) {
			e.printStackTrace( );
		}
		return true;
	}

}
