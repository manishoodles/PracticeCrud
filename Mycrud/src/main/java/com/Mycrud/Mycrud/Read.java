package com.Mycrud.Mycrud;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employe")
public class Read 
{
	@Id
	String id;
	String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Read(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Read() {
		super();
		this.id = id;
		this.name = name;
	}
	
}
