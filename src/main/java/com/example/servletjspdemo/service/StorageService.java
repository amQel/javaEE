package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Person;

public class StorageService {
	
	private List<Person> db = new ArrayList<Person>();
	
	public void add(Person person){
		Person newPerson = new Person(person.getFirstName(), person.getYob(), person.getPlec(), person.getHobby(), person.getOpisSiebie(), person.getWyksztalcenie());
		db.add(newPerson);
	}
	
	public List<Person> getAllPersons(){
		return db;
	}
	
	public int size()
	{
		return db.size();
	}

}
