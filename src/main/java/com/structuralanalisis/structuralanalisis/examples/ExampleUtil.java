package com.structuralanalisis.structuralanalisis.examples;

import java.util.ArrayList;
import java.util.List;

import com.structuralanalisis.structuralanalisis.dtos.Element;
import com.structuralanalisis.structuralanalisis.dtos.Material;
import com.structuralanalisis.structuralanalisis.dtos.Node;
import com.structuralanalisis.structuralanalisis.dtos.PuntualLoad;
import com.structuralanalisis.structuralanalisis.dtos.Section;
import com.structuralanalisis.structuralanalisis.dtos.Support;

public abstract class ExampleUtil {
	
	protected static List<Support> generateSupports(Object[][] supportsInfo) {
		
		List<Support> supports = new ArrayList<Support>();
		for(Object[] support : supportsInfo) {
			Double id = (Double) support[0];
			boolean verticalRestriction = (boolean) support[1];
			boolean rotationRestriction = (boolean) support[2];
			supports.add(new Support(id, verticalRestriction, rotationRestriction));
		}
		
		return supports;
	}

	protected static List<Element> generateElements(Object[][] elementsInfo) {
		
		List<Element> elements = new ArrayList<Element>();
		for(Object[] element : elementsInfo) {			
			Double id = (Double) element[0];
			Double startNodeId = (Double) element[1];
			Double endNodeId = (Double) element[2];
			Double materialId = (Double) element[3];
			Double sectionId = (Double) element[4];
			elements.add(new Element(id, startNodeId, endNodeId, materialId, sectionId));
		}
		
		return elements;
	}
	
	protected static List<PuntualLoad> generatePuntualLoads(Object[][] puntualLoadsInfo) {
		
		List<PuntualLoad> puntualLoads = new ArrayList<PuntualLoad>();
		for(Object[] puntualLoad : puntualLoadsInfo) {
			Double id = (Double) puntualLoad[0];
			Double force = (Double) puntualLoad[1];
			Double moment = (Double) puntualLoad[2];
			puntualLoads.add(new PuntualLoad(id, force, moment));
		}
		
		return puntualLoads;
	}
	
	protected static List<Section> generateSections(Object[][] sectionsInfo) {
		
		List<Section> sections = new ArrayList<Section>();
		for(Object[] section : sectionsInfo) {
			Double id = (Double) section[0];
			String name = (String) section[1];
			Double momentOfInertia = (Double) section[2];
			sections.add(new Section(id, name, momentOfInertia));
		}
		
		return sections;
	}

	protected static List<Material> generateMaterials(Object[][] materialsInfo) {
		
		List<Material> materials = new ArrayList<Material>();
		for(Object[] material : materialsInfo) {
			Double id = (Double) material[0];
			String name = (String) material[1];
			Double youngModulus = (Double) material[2];
			materials.add(new Material(id, name, youngModulus));
		}
		
		return materials;
	}

	protected static List<Node> generateNodes(Double [][] nodesInfo) {
		
		List<Node> nodes = new ArrayList<Node>();
		for(Double [] node : nodesInfo) {
			Double id = node[0];
			Double x = node[1];
			nodes.add(new Node(id, x));
		}
		
		return nodes;
	}
}
