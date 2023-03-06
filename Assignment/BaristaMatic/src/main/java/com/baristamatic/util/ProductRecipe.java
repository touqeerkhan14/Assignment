package com.baristamatic.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class ProductRecipe {
	
	private Map<String, Integer> recipe;
	public final String name;
	private double cost;

	protected InventoryService inventory;

	public ProductRecipe(String name, InventoryService inventory) {
		this.inventory = inventory;
		this.name = name;
		recipe = new HashMap<String, Integer>();
		setRecipe();
		cost = (double)cost() / 100;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void addIngredient(String ingredient, int qty) {
		recipe.put(ingredient, qty);
	}
	
	public abstract void setRecipe();
	
	public void dispenseCoffee() {
		System.err.println("Dispensing: " + name);
	}
	
	public void outOfStock() {
		System.err.println("Out of Stock: " + name);
	}

	public Product makeDrink() throws CloneNotSupportedException {
		Product drink;
		if (isInStock()) {
			drink = new Product(name);
			for (Entry<String, Integer> ingredient : recipe.entrySet()) {
				for (int i = 0; i < ingredient.getValue(); i++) {
					drink = inventory.get(ingredient.getKey()).addIngredient(drink);
				}
			}
			dispenseCoffee();
			return drink;
		}
		else {
			outOfStock();
			return null;
		}
	}
	
	public  boolean isInStock() {
		for (Entry<String, Integer> ingredient : recipe.entrySet()) {
			if (!inventory.checkGoods(ingredient.getKey(), ingredient.getValue())) {
				return false;
			}
		}
		return true;
	}
	
	public int cost() {
		int cost = 0;
		for (Entry<String, Integer> ingredient : recipe.entrySet()) {
			for (int i = 0; i < ingredient.getValue(); i++) {
				cost += inventory.getCost(ingredient.getKey());
			}
		}
		return cost;
	}

}


