package com.programs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class ProgramDto {

	public String name;
    private String domain;
    private String programType;
	private String registrationsStatus;
	private String description;
	private String placementAssurance;
	private String imageUrl;
	private String universityName;
	private String facultyProfile;
	private int learningHours;
	private String duration;
	private String credentialType;
	private String eligibilityCriteria;	
}
