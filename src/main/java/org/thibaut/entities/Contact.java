package org.thibaut.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "contacts")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Contact implements Serializable {

	@Id @GeneratedValue
	private Long id;

	private String nom;

	private String prenom;

	@Temporal( TemporalType.DATE )
	private Date dateNaissance;

	private String email;

	private long tel;

	private String photo;

	public Contact( String nom, String prenom, Date dateNaissance, String email, long tel, String photo ) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.tel = tel;
		this.photo = photo;
	}
}
