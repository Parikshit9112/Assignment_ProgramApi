package com.programs.entity;

import com.programs.entity.enums.CredentialType;
import com.programs.entity.enums.RegistrationsStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Program {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="program_name",nullable=false,unique=true)
	private String name;
    private String domain;
    private String programType;
    @Enumerated(value=EnumType.STRING)
    @Builder.Default
	private RegistrationsStatus registrationsStatus=RegistrationsStatus.closed;
    @Column(length=10000)
	private String description;
	private boolean placementAssurance;
	private String imageUrl;
	private String universityName;
	private String facultyProfile;
	private int learningHours;
	private String duration;
	@Enumerated(value=EnumType.STRING)
	@Builder.Default
	private CredentialType credentialType=CredentialType.Diploma;
	private String eligibilityCriteria;	
}
