package com.example.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	public PersonService() {
		Person p = new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("hassan");
		p.setLastName("Hossam");
		persons.add(p);

		p = new Person();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("JK");
		p.setLastName("Salah");
		persons.add(p);
		
		p = new Person();
		p.setId("3");
		p.setAge(25);
		p.setFirstName("Amr");
		p.setLastName("Mostafa");
		persons.add(p);
		
		p = new Person();
		p.setId("4");
		p.setAge(25);
		p.setFirstName("HAsssan");
		p.setLastName("Diab");
		persons.add(p);
		
	}
	public Person getPerson(String id) {
		for(Person person:persons) {
			if(person.getId().equalsIgnoreCase(id)) return person;
		}
	    return null;
	}
	public ArrayList<Person> getAll() {
		return persons;
	}
}

