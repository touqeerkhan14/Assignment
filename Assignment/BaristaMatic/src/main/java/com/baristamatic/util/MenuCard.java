package com.baristamatic.util;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MenuCard {
	
	private Map<String, ProductRecipe> recipes;

	public MenuCard(InventoryService inventory) {
		recipes = new TreeMap<>();
		
		add(new CaffeAmericanoRecipe(inventory));
		add(new CaffeLatteRecipe(inventory));
		add(new CaffeMochaRecipe(inventory));
		add(new CappuccinoRecipe(inventory));
		add(new CoffeeRecipe(inventory));
		add(new DecafCoffeeRecipe(inventory));
		
	}
	
	public void add(ProductRecipe recipe) {
		if (recipes.containsKey(recipe.name)) {
			throw new RuntimeException();
		}
		else {
			recipes.put(recipe.name, recipe);
		}
	}
	
	public void display() {
		System.out.println("Menu:");
		int i = 0;
		for (Entry<String, ProductRecipe> recipe : recipes.entrySet()) {
			String price = String.format("%.2f", recipe.getValue().getCost());
			System.out.println( (i + 1 ) + "," + recipe.getKey() + "," + "$" + price + "," + recipe.getValue().isInStock() );
			i++;
		}
	}
	
	public Product makeDrink(int index) throws CloneNotSupportedException {
		if (index < recipes.size()) {
			Iterator<ProductRecipe> it = recipes.values().iterator();
			for (int i = 0; i < index; i++) {
				it.next();
			}
			return it.next().makeDrink();
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}

}