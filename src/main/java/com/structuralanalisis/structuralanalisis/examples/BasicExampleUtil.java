package com.structuralanalisis.structuralanalisis.examples;

import com.structuralanalisis.structuralanalisis.dtos.BeamProblem;

public class BasicExampleUtil extends ExampleUtil{

	public static BeamProblem getExample() {
		
		BeamProblem problem = new BeamProblem();
		problem.getNodes().addAll(generateNodes(new Double[][]{{1d, 0d},{1.5d, 2.5d}, {2d, 5d}, {3d, 10d}}));
		problem.getMaterials().addAll(generateMaterials(new Object[][] {{1d, "M1", 200000d}}));
		problem.getSections().addAll(generateSections(new Object[][] {{1d, "S1", 0.0001333333}}));
		problem.getPuntualLoads().addAll(generatePuntualLoads(new Object[][] {{2d, -10d, 0d}}));
		problem.getSupports().addAll(generateSupports(new Object[][] {{1d, true, true}, {3d, true, true}}));
		problem.getElements().addAll(generateElements(new Object[][] {{1d, 1d, 1.5d, 1d, 1d}, {2d, 1.5d, 2d, 1d, 1d}, {3d, 2d, 3d, 1d, 1d}}));
		
		return problem;
	}
}
