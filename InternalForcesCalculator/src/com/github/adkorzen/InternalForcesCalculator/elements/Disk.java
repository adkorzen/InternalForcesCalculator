package com.github.adkorzen.InternalForcesCalculator.elements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Disk {
	private final Project project;
	private List<Bar> elements = new ArrayList<Bar>();
	
	public Disk(Project project) {
		this.project = project;
	}
	
//	public void merge(Disk other) {
//		for (Iterator<Bar> it = other.elements.iterator(); it.hasNext();) {
//		    Bar bar = it.next();
//		    elements.add(bar);
//		    it.remove();
//		}
//		project.removeDisk(other);
//	}
//	
//	public void addElement(Bar element) {
//		elements.add(element);
//	}
//	
//	public boolean contains(Bar element) {
//		return elements.contains(element);
//	}
}