package com.structuralanalisis.structuralanalisis.dtos;

public class Node implements Identifiable, Comparable<Node>{

	private Double id;
	
	private double x;

	public Node() {
		
	}
	
	public Node(Double id, double x) {
		super();
		this.id = id;
		this.x = x;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public int compareTo(Node o) {
		return Double.compare(x, o.x);
	}
}
