package com.structuralanalisis.structuralanalisis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.structuralanalisis.structuralanalisis.dtos.BeamAnswer;
import com.structuralanalisis.structuralanalisis.dtos.BeamProblem;
import com.structuralanalisis.structuralanalisis.examples.BasicExampleUtil;
import com.structuralanalisis.structuralanalisis.services.BeamSolverI;

@RestController
public class BeamController {

	@Autowired
	private BeamSolverI beamSolverService;
	
	@GetMapping("/BasicBeamProblem.json")
	public BeamProblem getExample() {
		return BasicExampleUtil.getExample();
	}
	
	@GetMapping("/BasicBeamAnswer.json")
	public BeamAnswer getExampleAnswer() {
		return beamSolverService.solveBeam(BasicExampleUtil.getExample());
	}
	
	@PostMapping("/BeamSolver")
	public BeamAnswer solveBeam(@RequestBody BeamProblem beamProblem) {
		return beamSolverService.solveBeam(beamProblem);
	}
}
