package com.structuralanalisis.structuralanalisis.util;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.structuralanalisis.structuralanalisis.dtos.Element;
import com.structuralanalisis.structuralanalisis.dtos.Identifiable;
import com.structuralanalisis.structuralanalisis.dtos.Node;

public class SolverUtil {

	private static Logger logger = LoggerFactory.getLogger(SolverUtil.class);
	
	public static Map<Double, Integer> getIndexByNodeId(List<Node> nodes) {
		
		Map<Double, Integer> indexByNodeId = new HashMap<Double, Integer>();
		int index = 1;
		
		for(Node node : nodes) {
			indexByNodeId.put(node.getId(), index++);
		}
		
		return indexByNodeId;
	}
	
	public static <T extends Identifiable> Map<Double, T> getById(List<T> list) {
		
		if(list == null)
			return new HashMap<Double, T>();
		
		return list.parallelStream().collect(Collectors.toMap(e -> e.getId(), e -> e));
	}
	
	public static Map<Double, Node> getNodeById(List<Node> nodes) {
		
		Map<Double, Node> nodeById = new HashMap<Double, Node>();
		
		if(nodes == null)
			return nodeById;
		
		for(Node node : nodes) {
			nodeById.put(node.getId(), node);
		}
		
		return nodeById;
	}

	public static void processLengths(Map<Double, Node> nodeById, List<Element> elements) {
		
		if(elements == null)
			return;
		
		for(Element element : elements) {
			
			final Node start = nodeById.get(element.getStartNodeId());
			final Node end = nodeById.get(element.getEndNodeId());
			element.setLength(Math.abs(start.getX() - end.getX()));			
		}
	}
	
	public static void printVector(String title, double[] vector) {
		logger.debug(title);
		DecimalFormat doubleFormat = new DecimalFormat("#.##");
		for (int i = 0; i < vector.length; i++) {
			logger.debug(doubleFormat.format(vector[i])); 
		}
	}
	
	public static void printMatrix(String title, double[][] matrix) {
		logger.debug(title);
		DecimalFormat doubleFormat = new DecimalFormat("#.##");
		for (int i = 0; i < matrix.length; i++) {
			StringBuilder info = new StringBuilder();
			for (int j = 0; j < matrix[i].length; j++) 
				info.append(doubleFormat.format(matrix[i][j])).append(" "); 
			logger.debug(info.toString());
		}
	}
	
	public static double [][] copyMatrix(double [][] matrix){
		double [][] myCopy = new double[matrix.length][];
		for(int i = 0; i < matrix.length; i++)
		    myCopy[i] = matrix[i].clone();
		return myCopy;
	}
	
	public static double [] copyVector(double [] vector){
		return vector.clone();
	}
}