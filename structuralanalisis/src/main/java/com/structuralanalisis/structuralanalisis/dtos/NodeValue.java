package com.structuralanalisis.structuralanalisis.dtos;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.structuralanalisis.structuralanalisis.serializer.NodeValueSerializer;

public class NodeValue implements Comparable<NodeValue> {

	@JsonSerialize(using = NodeValueSerializer.class)
	private Double x;

	@JsonSerialize(using = NodeValueSerializer.class)
	private Double value;
	
	public NodeValue() {
		
	}
	
	public NodeValue(Double x) {
		super();
		this.x = x;
		this.value = 0d;
	}

	public NodeValue(Double x, Double value) {
		super();
		this.x = x;
		this.value = value;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public int compareTo(NodeValue o) {
		return Double.compare(x, o.x);
	}
}