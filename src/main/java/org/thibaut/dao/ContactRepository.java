package org.thibaut.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.thibaut.entities.Contact;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository< Contact, Long > {

//	public Page<Contact> getContactsByNomContains(String nom);

	@Query("select c from Contact c where c.nom like :n")
	public List<Contact> chercherContact( @Param( "n" ) String nom);
}
