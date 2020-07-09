package com.structuralanalisis.structuralanalisis.dtos;

import java.util.List;

public class BeamAnswer {

	List<NodeValue> shearDiagram;
	
	List<NodeValue> momentDiagram;
	
	private int degreesOfFreedom;

	public BeamAnswer() {
		
	}

	public BeamAnswer(List<NodeValue> shearDiagram, List<NodeValue> momentDiagram) {
		super();
		this.shearDiagram = shearDiagram;
		this.momentDiagram = momentDiagram;
	}

	public List<NodeValue> getShearDiagram() {
		return shearDiagram;
	}

	public void setShearDiagram(List<NodeValue> shearDiagram) {
		this.shearDiagram = shearDiagram;
	}

	public List<NodeValue> getMomentDiagram() {
		return momentDiagram;
	}

	public void setMomentDiagram(List<NodeValue> momentDiagram) {
		this.momentDiagram = momentDiagram;
	}

	public int getDegreesOfFreedom() {
		return degreesOfFreedom;
	}

	public void setDegreesOfFreedom(int degreesOfFreedom) {
		this.degreesOfFreedom = degreesOfFreedom;
	}
}
