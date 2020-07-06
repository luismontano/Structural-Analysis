package com.structuralanalisis.structuralanalisis.dtos;

import java.util.ArrayList;
import java.util.List;

public class BeamProblem {

	private List<Node> nodes;
	
	private List<Material> materials;
	
	private List<Section> sections;
	
	private List<PuntualLoad> puntualLoads;
	
	private List<Support> supports;
	
	private List<Element> elements;
	
	public BeamProblem() {
		super();
		nodes = new ArrayList<Node>();
		materials = new ArrayList<Material>();
		sections = new ArrayList<Section>();
		puntualLoads = new ArrayList<PuntualLoad>();
		supports = new ArrayList<Support>();
		elements = new ArrayList<Element>();
	}

	public BeamProblem(List<Node> nodes, List<Material> materials, List<Section> sections,
			List<PuntualLoad> puntualLoads, List<Support> supports, List<Element> elements) {
		super();
		this.nodes = nodes;
		this.materials = materials;
		this.sections = sections;
		this.puntualLoads = puntualLoads;
		this.supports = supports;
		this.elements = elements;
	}

	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	public List<Material> getMaterials() {
		return materials;
	}

	public void setMaterials(List<Material> materials) {
		this.materials = materials;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public List<PuntualLoad> getPuntualLoads() {
		return puntualLoads;
	}

	public void setPuntualLoads(List<PuntualLoad> puntualLoads) {
		this.puntualLoads = puntualLoads;
	}

	public List<Support> getSupports() {
		return supports;
	}

	public void setSupports(List<Support> supports) {
		this.supports = supports;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
}
