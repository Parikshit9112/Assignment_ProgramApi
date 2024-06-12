package com.programs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programs.dto.ProgramDto;
import com.programs.entity.Program;
import com.programs.entity.enums.CredentialType;
import com.programs.entity.enums.RegistrationsStatus;
import com.programs.exception.ResourceNotFoundException;
import com.programs.repository.ProgramRepo;
import com.programs.service.ProgramService;

@Service
public class ProgramServiceImpl implements ProgramService {
    
	@Autowired
	private ProgramRepo programRepo;
	
	@Override
	public Program createProgram(ProgramDto programDto) {
		System.out.println(programDto);
		Program program=new Program();
		program.setName(programDto.getName());
		program.setDomain(programDto.getDomain());
	    program.setProgramType(programDto.getProgramType());
		program.setRegistrationsStatus(programDto.getRegistrationsStatus().equalsIgnoreCase("open") ?
			    RegistrationsStatus.open : RegistrationsStatus.closed);
		program.setDescription(programDto.getDescription());
		program.setPlacementAssurance(programDto.getPlacementAssurance().equalsIgnoreCase("yes") ?
				true : false);
		program.setImageUrl(programDto.getImageUrl());
		program.setUniversityName(programDto.getUniversityName());
		program.setFacultyProfile(programDto.getFacultyProfile());
		program.setLearningHours(programDto.getLearningHours());
		program.setDuration(programDto.getDuration());
		program.setCredentialType(programDto.getCredentialType().equalsIgnoreCase("diploma") ?
				CredentialType.Diploma : CredentialType.Certificate);
		program.setEligibilityCriteria(programDto.getEligibilityCriteria());	
		return programRepo.save(program);
	}

	@Override
	public List<Program> getAllPrograms() {
		return programRepo.findAll();
	}

	@Override
	public Program getProgramById(Long id) {
		   Program program=programRepo.findById(id).orElseThrow(() -> 
		   new ResourceNotFoundException("Program not found for this id :: " + id));
		return program;
	}

	@Override
	public Program getProgramByName(String name) {
		Program program=programRepo.findByName(name).orElseThrow(() -> 
		 new ResourceNotFoundException("Program not found with this name :: " + name));
		return program;
	}

	@Override
	public Program updateProgram(Long id, ProgramDto programDto) {
		Program program=programRepo.findById(id).orElseThrow(() -> 
		   new ResourceNotFoundException("Program not found for this id :: " + id));
		program.setName(programDto.getName());
		program.setDomain(programDto.getDomain());
	    program.setProgramType(programDto.getProgramType());
		program.setRegistrationsStatus(programDto.getRegistrationsStatus().equalsIgnoreCase("open") ?
			    RegistrationsStatus.open : RegistrationsStatus.closed);
		program.setDescription(programDto.getDescription());
		program.setPlacementAssurance(programDto.getPlacementAssurance().equalsIgnoreCase("yes") ?
				true : false);
		program.setImageUrl(programDto.getImageUrl());
		program.setUniversityName(programDto.getUniversityName());
		program.setFacultyProfile(programDto.getFacultyProfile());
		program.setLearningHours(programDto.getLearningHours());
		program.setDuration(programDto.getDuration());
		program.setCredentialType(programDto.getCredentialType().equalsIgnoreCase("diploma") ?
				CredentialType.Diploma : CredentialType.Certificate);
		program.setEligibilityCriteria(programDto.getEligibilityCriteria());	
		return programRepo.save(program);
	}

	@Override
	public String deleteProgram(Long id) {
		Program program=programRepo.findById(id).orElseThrow(() -> 
		   new ResourceNotFoundException("Program not found for this id :: " + id));
		programRepo.delete(program);
		return "Program successfully deleted with id :: " +id;
	}

}
