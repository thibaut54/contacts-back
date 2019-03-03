package org.thibaut;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thibaut.dao.ContactRepository;
import org.thibaut.entities.Contact;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase( ContactRepository contactRepository) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return args -> {
			log.info("Preloading " + contactRepository.save(
				new Contact( "Jean",
						"Valjean",
						df.parse( "10/03/1985" ),
						"jean@gmail.com",
						336060606,
						"http://www.unnPhoto.com")));
			log.info("Preloading " + contactRepository.save(
				new Contact( "Luc",
						"Skywalker",
						df.parse( "11/03/1986" ),
						"luc@gmail.com",
						336060606,
						"http://www.unnPhoto.com") ));
			log.info("Preloading " + contactRepository.save(
					new Contact( "John",
							"McLane",
							df.parse( "11/03/1987" ),
							"john@gmail.com",
							336060606,
							"http://www.unnPhoto.com") ));
			log.info("Preloading " + contactRepository.save(
					new Contact( "Paul",
							"NC",
							df.parse( "10/03/1985" ),
							"jean@gmail.com",
							336060606,
							"http://www.unnPhoto.com")));
			log.info("Preloading " + contactRepository.save(
					new Contact( "Brian",
							"Skywalker",
							df.parse( "11/03/1986" ),
							"luc@gmail.com",
							336060606,
							"http://www.unnPhoto.com") ));
			log.info("Preloading " + contactRepository.save(
					new Contact( "Dude",
							"McLane",
							df.parse( "11/03/1987" ),
							"john@gmail.com",
							336060606,
							"http://www.unnPhoto.com") ));
			log.info("Preloading " + contactRepository.save(
					new Contact( "Lea",
							"Valjean",
							df.parse( "10/03/1985" ),
							"jean@gmail.com",
							336060606,
							"http://www.unnPhoto.com")));
			log.info("Preloading " + contactRepository.save(
					new Contact( "Albert",
							"Skywalker",
							df.parse( "11/03/1986" ),
							"luc@gmail.com",
							336060606,
							"http://www.unnPhoto.com") ));
			log.info("Preloading " + contactRepository.save(
					new Contact( "Michel",
							"McLane",
							df.parse( "11/03/1987" ),
							"john@gmail.com",
							336060606,
							"http://www.unnPhoto.com") ));
		};
	}
}
