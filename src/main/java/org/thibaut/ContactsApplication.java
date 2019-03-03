package org.thibaut;

import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.thibaut.dao.ContactRepository;
import org.thibaut.entities.Contact;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@SpringBootApplication
@EnableJpaRepositories("org.thibaut")
public class ContactsApplication {

	@Autowired
	private ContactRepository contactRepository;

	public static void main( String[] args ) {
		SpringApplication.run( ContactsApplication.class, args );
	}

}
