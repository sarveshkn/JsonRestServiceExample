package com.practise.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Education {
	
	@JsonCreator
	public Education(@JsonProperty("school") String school) {
		super();
		this.school = school;
	}
	
	public Education() {
	}

	private String school;

	@Override
	public String toString() {
		return "Education [school=" + school + "]";
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

}
