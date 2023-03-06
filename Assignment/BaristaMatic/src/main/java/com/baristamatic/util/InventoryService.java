package com.baristamatic.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class InventoryService {

	private Map<String, Integer> goodsQuantity;
	private Map<String, IngredientService> goodsIngredients;

	public InventoryService() {
		
		goodsQuantity = new TreeMap<String, Integer>();
		goodsIngredients = new HashMap<String, IngredientService>();
		
		loadGoods(new Cocoa());
		loadGoods(new Coffee());
		loadGoods(new Cream());
		loadGoods(new DecafCoffee());
		loadGoods(new Espresso());
		loadGoods(new FoamedMilk());
		loadGoods(new SteamedMilk());
		loadGoods(new Sugar());
		loadGoods(new WhippedCream());
		
	}
	
	public void display() {
		System.out.println("Current Inventory:");
		Iterator<String> it1 = goodsQuantity.keySet().iterator();
		Iterator<Integer> it2 = goodsQuantity.values().iterator();
		while (it1.hasNext() && it2.hasNext()) {
			System.out.println(it1.next() + ", " + it2.next());
		}
	}
	
	public void restock() {
		for (String ingredient : goodsQuantity.keySet()) {
			goodsQuantity.put(ingredient, 10);
		}
	}
	
	public void loadGoods(IngredientService ingredient) {
		if (goodsIngredients.containsKey(ingredient.getName())) {
			throw new RuntimeException();
		}
		else {
			goodsIngredients.put(ingredient.getName(), ingredient);
			goodsQuantity.put(ingredient.getName(), 10);
		}
	}
	
	public boolean checkGoods(String ingredient, int qty) {
		if (goodsIngredients.containsKey(ingredient)) {
			if (goodsQuantity.get(ingredient) >= qty) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			throw new RuntimeException(ingredient);
		}
	}
	
	public IngredientService get(String ingredient) throws CloneNotSupportedException {
		if (checkGoods(ingredient, 1)) {
			goodsQuantity.put(ingredient, goodsQuantity.get(ingredient) - 1);
			return goodsIngredients.get(ingredient).clone();
		}
		else {
			throw new RuntimeException();
		}
	}
	
	public int getCost(String ingredient) {
		if (goodsIngredients.containsKey(ingredient)) {
			return goodsIngredients.get(ingredient).cost();
		}
		else {
			throw new RuntimeException();
		}
	}

}
