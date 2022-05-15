package gameProject.entities;

import gameProject.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private String name;
	private double unitPrice;
	private double unitPriceAfterDiscount;
	
	public Game() {
		
	}
	
	public Game(int id, String name, double unitPrice, double unitPriceAfterDiscount) {
		
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getUnitPriceAfterDiscount() {
		return unitPriceAfterDiscount;
	}

}
