package com.structuralanalisis.structuralanalisis.dtos;

public class Section implements Identifiable{

	private Double id;
	
	private String name;
	
	private double momentOfInertia;

	public Section() {
		
	}
	
	public Section(Double id, String name, double momentOfInertia) {
		super();
		this.id = id;
		this.name = name;
		this.momentOfInertia = momentOfInertia;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMomentOfInertia() {
		return momentOfInertia;
	}

	public void setMomentOfInertia(double momentOfInertia) {
		this.momentOfInertia = momentOfInertia;
	}
}
