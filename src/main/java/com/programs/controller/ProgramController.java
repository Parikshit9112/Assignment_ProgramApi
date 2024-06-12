package com.programs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programs.dto.ProgramDto;
import com.programs.entity.Program;
import com.programs.service.ProgramService;

@RestController
@RequestMapping("/api/program"	)
public class ProgramController {
	 @Autowired
	 private ProgramService programService;
	 
	 @PostMapping("/create")
	  public Program createProgram(@RequestBody ProgramDto programDto) {
	      return programService.createProgram(programDto);
	   }
	  
	 @PutMapping("/update/{id}")
	  public Program updateProgram(@PathVariable Long id, @RequestBody ProgramDto programDto) {
	      return programService.updateProgram(id, programDto);
	   }
	  
	 @GetMapping("/getAll")
	  public List<Program> getAllPrograms() {
	      return programService.getAllPrograms();
	   }

	  @GetMapping("/getById/{id}")
	   public Program getProgramById(@PathVariable Long id) {
	       return programService.getProgramById(id);
	   }
	  
	  @GetMapping("/getByName/{name}")
	   public Program getProgramByName(@PathVariable String name) {
	       return programService.getProgramByName(name);
	   }
	  
	  @DeleteMapping("/delete/{id}")
	   public String deleteProgram(@PathVariable Long id) {
	        return programService.deleteProgram(id);
	   }
}
