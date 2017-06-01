package com.practise.serverside.service;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.practise.model.Address;
import com.practise.model.Person;

@Path("/person")
public class PersonController {
	
	@POST
	@Path("/getPerson")
	public Person getPerson(Person person, @QueryParam("personName") String personName) {
		if (person != null) {
			person.setName(person.getName().concat(personName));
		}
		return person;
	}
	
	@GET
	@Path("/getName")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPersonName(@QueryParam("personName") String personName) {
		Person p = new Person();
		p.setName(personName);
		p.setAge(11);
		Address address = new Address();
		address.setPostalCode("226016");
		address.setStreet("Indira");
		p.setAddress(address);
		return Response.status(201).entity(p.toString()).build();
	}
	
	@POST
	@Path("/name")
	@Produces(MediaType.TEXT_PLAIN)
	public String getName() {
		return "Hello";
	}

}
