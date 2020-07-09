package com.structuralanalisis.structuralanalisis.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Support implements Identifiable{

	private Double nodeId;
	
	private boolean verticalRestriction;
	
	private boolean rotationRestriction;

	public Support() {
		
	}
	
	public Support(Double nodeId, boolean verticalRestriction, boolean rotationRestriction) {
		super();
		this.nodeId = nodeId;
		this.verticalRestriction = verticalRestriction;
		this.rotationRestriction = rotationRestriction;
	}

	public Double getNodeId() {
		return nodeId;
	}

	public void setNodeId(Double nodeId) {
		this.nodeId = nodeId;
	}

	public boolean isVerticalRestriction() {
		return verticalRestriction;
	}

	public void setVerticalRestriction(boolean verticalRestriction) {
		this.verticalRestriction = verticalRestriction;
	}

	public boolean isRotationRestriction() {
		return rotationRestriction;
	}

	public void setRotationRestriction(boolean rotationRestriction) {
		this.rotationRestriction = rotationRestriction;
	}

	@JsonIgnore
	@Override
	public Double getId() {
		return nodeId;
	}
}
