package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Repo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;
	private String name;
	
	public int getid() {
		return id;
	}
	public Repo() {}
	public Repo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setid(int aid) {
		this.id = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", Name=" + name + "]";
	}


}
