package com.programs.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor

@ToString
public class ProgramDto {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getProgramType() {
		return programType;
	}
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	public String getRegistrationsStatus() {
		return registrationsStatus;
	}
	public void setRegistrationsStatus(String registrationsStatus) {
		this.registrationsStatus = registrationsStatus;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlacementAssurance() {
		return placementAssurance;
	}
	public void setPlacementAssurance(String placementAssurance) {
		this.placementAssurance = placementAssurance;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getFacultyProfile() {
		return facultyProfile;
	}
	public void setFacultyProfile(String facultyProfile) {
		this.facultyProfile = facultyProfile;
	}
	public int getLearningHours() {
		return learningHours;
	}
	public void setLearningHours(int learningHours) {
		this.learningHours = learningHours;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCredentialType() {
		return credentialType;
	}
	public void setCredentialType(String credentialType) {
		this.credentialType = credentialType;
	}
	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}
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
