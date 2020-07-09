package com.structuralanalisis.structuralanalisis.dtos;

public class Element {

	private Double id;
	
	private Double startNodeId;
	
	private Double endNodeId;
	
	private Double materialId;
	
	private Double sectionId;
	
	private Double length;
	
	public Element() {
		
	}

	public Element(Double id, Double startNodeId, Double endNodeId, Double materialId, Double sectionId) {
		super();
		this.id = id;
		this.startNodeId = startNodeId;
		this.endNodeId = endNodeId;
		this.materialId = materialId;
		this.sectionId = sectionId;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public Double getStartNodeId() {
		return startNodeId;
	}

	public void setStartNodeId(Double startNodeId) {
		this.startNodeId = startNodeId;
	}

	public Double getEndNodeId() {
		return endNodeId;
	}

	public void setEndNodeId(Double endNodeId) {
		this.endNodeId = endNodeId;
	}

	public Double getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Double materialId) {
		this.materialId = materialId;
	}

	public Double getSectionId() {
		return sectionId;
	}

	public void setSectionId(Double sectionId) {
		this.sectionId = sectionId;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}
	
	public Element copy() {
		
		Element element = new Element();
		element.startNodeId = startNodeId;
		element.endNodeId = endNodeId;
		element.materialId = materialId;
		element.sectionId = sectionId;
		
		return element;
	}
}
