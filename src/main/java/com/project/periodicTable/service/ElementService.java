package com.project.periodicTable.service;

import java.util.List;
import com.project.periodicTable.model.*;

/*
 * Service interface for defining methods to fetch chemical elements.
 */
public interface ElementService {
	
	public List<Element> getAllElements();
	public Element getElementBySymbol(String symbol);

}
