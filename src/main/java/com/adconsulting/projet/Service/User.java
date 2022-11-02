package com.adconsulting.projet.Service;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity(name = "User")
@Table(name="User")
public class User {

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeProjet() {
		return typeProjet;
	}

	public void setTypeProjet(String typeProjet) {
		this.typeProjet = typeProjet;
	}

	public String getDescriptionProjet() {
		return descriptionProjet;
	}

	public void setDescriptionProjet(String descriptionProjet) {
		this.descriptionProjet = descriptionProjet;
	}

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;

	@Basic
	@Column(name = "firstName", columnDefinition = "VARCHAR(45)")
    private String firstName;
	
	@Basic
	@Column(name = "lastName", columnDefinition = "VARCHAR(45)")
    private String lastName;

    @Basic
    @Column(name = "email", columnDefinition = "VARCHAR(45)")
    private String email;

    @Basic
    @Column(name = "typeProjet", columnDefinition = "VARCHAR(45)")
    private String typeProjet;
    
    @Basic
    @Column(name = "descriptionProjet", columnDefinition = "VARCHAR(45)")
    private String descriptionProjet;
    

	
}

