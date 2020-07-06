package com.structuralanalisis.structuralanalisis.dtos;

public class Material implements Identifiable{

	private Double id;
	
	private String name;
	
	private double youngModulus;

	public Material() {
		
	}
	
	public Material(Double id, String name, double youngModulus) {
		super();
		this.id = id;
		this.name = name;
		this.youngModulus = youngModulus;
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

	public double getYoungModulus() {
		return youngModulus;
	}

	public void setYoungModulus(double youngModulus) {
		this.youngModulus = youngModulus;
	}
}
