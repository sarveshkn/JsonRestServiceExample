package com.practise.serverside.service;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import com.practise.model.Address;
import com.practise.model.Education;
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
	
	@POST
	@Path("/savePerson")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePerson(Person p) {
		p.setName(" Sarvesh kaushik. You are awesome husband");
		p.setAge("11");
		Address address = new Address();
		address.setPostalCode("226016");
		address.setStreet("Indira");
		p.setAddress(address);
		System.out.println("Server" + p.toString());
		JSONObject j = new JSONObject(p);
		return Response
				   .status(201)
				   .entity(j.toString()).build();
	}
	
	@POST
	@Path("/getJsonPerson")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson(String p) {
		System.out.println("Server" + p.toString());
		JSONObject j = new JSONObject(p);
		return Response
				   .status(200)
				   .entity(j.toString()).build();
	}
	
	@POST
	@Path("/getEducation")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEducation(Education edu) {
		System.out.println("Server" +edu.toString());
		JSONObject j = new JSONObject(edu);
		return Response
				   .status(200)
				   .entity(j.toString()).build();
	}
	
	@GET
	@Path("/name/{personName}")
	public Response getPersonName(@PathParam("personName") String personName) {
		Person p = new Person();
		p.setName(personName + " anjali kaushik. You are lovely wife");
		p.setAge("11");
		Address address = new Address();
		address.setPostalCode("226016");
		address.setStreet("Indira");
		p.setAddress(address);
		JSONObject j = new JSONObject(p);
		return Response
				   .status(200)
				   .entity(j.toString()).build();
	}
	
	@GET
	@Path("/print")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

}
