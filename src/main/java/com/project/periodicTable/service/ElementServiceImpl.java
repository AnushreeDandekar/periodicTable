package com.project.periodicTable.service;

import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.*;

import com.project.periodicTable.model.Element;
import com.google.gson.Gson;
import com.google.gson.reflect.*;
import java.io.InputStreamReader;

/*
 * Implementation of the ElementService interface.
 * Consists of the business logic to retrieve elements from elements.json
 */

@Service
public class ElementServiceImpl implements ElementService{

	/*
	 * Fetches all the 118 elements from json file in the form of a list.
	 * @returns List<Element>
	 */
	@Override
	public List<Element> getAllElements() {
		
		//load elements from elements.json and initialize InputStream.
		InputStream inputStream = null;
		try {
			inputStream = new ClassPathResource("elements.json").getInputStream();
		} catch (IOException e) {
			System.out.println("Error ocurred while fetching all elements from json file."+e);
			e.printStackTrace();
		}
		
		//parse JSON input stream into List<Element> using GSON.
        InputStreamReader reader = new InputStreamReader(inputStream);
		Gson gson = new Gson();
	    Type listType = new TypeToken<List<Element>>() {}.getType();
	    List<Element> list= gson.fromJson(reader, listType);
	    
		return list;
	}

	/*
	 * Fetches a particular element from json file on the basis of element name.
	 * @returns Element
	 */
	@Override
	public Element getElementBySymbol(String symbol) {
		
		//fetch all elements and filter the required element.
		List<Element> elems = getAllElements();
		for(Element el: elems) {
			if(symbol.equalsIgnoreCase(el.getSymbol())){
				return el;
			}
		}
		
		//if no element found
		return null;
	}

}
