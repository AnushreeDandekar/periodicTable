package com.project.periodicTable.model;

/*
 * Represents a chemical element in the periodic table.
 * Model consists of various attributes like name, symbol, group, etc.
 */
public class Element {
	
	private String name;
    private String appearance;
    private double atomic_mass;
    private String category;
    private double density;
    private String discovered_by;
    private int number;
    private int period;
    private int group;
    private String bohr_model_image;
    private String bohr_model_3d;
    private String summary;
    private String symbol;
    private int[] shells;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppearance() {
		return appearance;
	}
	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}
	public double getAtomic_mass() {
		return atomic_mass;
	}
	public void setAtomic_mass(double atomic_mass) {
		this.atomic_mass = atomic_mass;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}
	public String getDiscovered_by() {
		return discovered_by;
	}
	public void setDiscovered_by(String discovered_by) {
		this.discovered_by = discovered_by;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	public String getBohr_model_image() {
		return bohr_model_image;
	}
	public void setBohr_model_image(String bohr_model_image) {
		this.bohr_model_image = bohr_model_image;
	}
	public String getBohr_model_3d() {
		return bohr_model_3d;
	}
	public void setBohr_model_3d(String bohr_model_3d) {
		this.bohr_model_3d = bohr_model_3d;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int[] getShells() {
		return shells;
	}
	public void setShells(int[] shells) {
		this.shells = shells;
	}
	
	
	
	

}
