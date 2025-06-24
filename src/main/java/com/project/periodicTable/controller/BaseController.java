package com.project.periodicTable.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.project.periodicTable.model.*;

import com.project.periodicTable.service.ElementService;

@RestController
public class BaseController {
	
	@Autowired
	ElementService elemService;
	
	/*
	 * Shows all 118 elements
	 * @returns List<Element>
	 */
	@GetMapping("/allElements")
	public List<Element> getAllElementsList() {
		List<Element> list = elemService.getAllElements();
		return list;
	}
	
	/*
	 * Shows a particular element found by it's name
	 * @returns Element
	 */
	@GetMapping("/element/{symbol}")
	public Element getSingleElement(@PathVariable String symbol) {
		return elemService.getElementBySymbol(symbol);
	}

}	
