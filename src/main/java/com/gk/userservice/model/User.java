package com.gk.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
	private long id;
	private String name;
	private String address;
}
