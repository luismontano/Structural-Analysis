package com.structuralanalisis.structuralanalisis.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PuntualLoad implements Identifiable{

	private Double nodeId;
	
	private double force;
	
	private double moment;

	public PuntualLoad() {
		
	}
	
	public PuntualLoad(Double nodeId, double force, double moment) {
		super();
		this.nodeId = nodeId;
		this.force = force;
		this.moment = moment;
	}

	public Double getNodeId() {
		return nodeId;
	}

	public void setNodeId(Double nodeId) {
		this.nodeId = nodeId;
	}

	public double getForce() {
		return force;
	}

	public void setForce(double force) {
		this.force = force;
	}

	public double getMoment() {
		return moment;
	}

	public void setMoment(double moment) {
		this.moment = moment;
	}

	@JsonIgnore
	@Override
	public Double getId() {
		return nodeId;
	}
}
