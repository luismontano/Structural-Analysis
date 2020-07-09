package com.structuralanalisis.structuralanalisis.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.structuralanalisis.structuralanalisis.examples.BasicExampleUtil;
import com.structuralanalisis.structuralanalisis.util.SolverUtil;

@SpringBootTest
public class BeamSolverTest {

	@Autowired
	private BeamSolverI beamSolverService;
	
	@Test
	public void getRigidMatrixTest() {
				
		double [][] rigidMatrix = beamSolverService.getRigidMatrix(2l, 100000000, 0.00000085333333);
		SolverUtil.printMatrix("getRigidMatrixTest", rigidMatrix);
	}
	
	@Test
	public void solveBeamTest() {
		beamSolverService.solveBeam(BasicExampleUtil.getExample());
	}
}
