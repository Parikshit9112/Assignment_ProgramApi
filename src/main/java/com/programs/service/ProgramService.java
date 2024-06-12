package com.programs.service;

import java.util.List;

import com.programs.dto.ProgramDto;
import com.programs.entity.Program;


public interface ProgramService {
    
	//create program
	public Program createProgram(ProgramDto programDto);
	
	//get program
	public List<Program> getAllPrograms();
	public Program getProgramById(Long id);
	public Program getProgramByName(String name);
	
	//update program
	public Program updateProgram(Long id, ProgramDto programDto);
	
	//delete program
	public String deleteProgram(Long id);
}
