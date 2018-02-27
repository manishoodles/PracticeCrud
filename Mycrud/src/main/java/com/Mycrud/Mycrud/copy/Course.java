package com.Mycrud.Mycrud.copy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Mycrud.Mycrud.Read;

@Entity
@Table(name="course")
public class Course 

{
	@ManyToOne
	private Read read;
	
	public Read getRead() {
		return read;
	}
	public void setRead(Read read) {
		this.read = read;
	}
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
	public Course(String id, String name,String readId) {
		super();
		this.id = id;
		this.name = name;
		this.read=new Read(readId,"");
		
	}
	public Course() {
		super();
		this.id = id;
		this.name = name;
	}
	
}
