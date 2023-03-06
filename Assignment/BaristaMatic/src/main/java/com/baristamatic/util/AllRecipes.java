package com.baristamatic.util;


//////////////////////////////////////////////

class CoffeeRecipe extends ProductRecipe {

	public CoffeeRecipe(InventoryService inventory) {
		super("Coffee", inventory);
	}

	@Override
	public void setRecipe() {
		addIngredient("Coffee", 3);
		addIngredient("Sugar", 1);
		addIngredient("Cream", 1);
	}

}

//////////////////////////////////////////////


class DecafCoffeeRecipe extends ProductRecipe {

	public DecafCoffeeRecipe(InventoryService inventory) {
		super("Decaf Coffee", inventory);
	}

	@Override
	public void setRecipe() {
		addIngredient("Decaf Coffee", 3);
		addIngredient("Sugar", 1);
		addIngredient("Cream", 1);
	}

}

//////////////////////////////////////////////


class CaffeLatteRecipe extends ProductRecipe {

	public CaffeLatteRecipe(InventoryService inventory) {
		super("Caffe Latte", inventory);
	}

	@Override
	public void setRecipe() {
		addIngredient("Espresso", 2);
		addIngredient("Steamed Milk", 1);
	}

}

//////////////////////////////////////////////


class CaffeAmericanoRecipe extends ProductRecipe {

	public CaffeAmericanoRecipe(InventoryService inventory) {
		super("Caffe Americano", inventory);
	}

	@Override
	public void setRecipe() {
		addIngredient("Espresso", 3);
	}

}

//////////////////////////////////////////////


class CaffeMochaRecipe extends ProductRecipe {

	public CaffeMochaRecipe(InventoryService inventory) {
		super("Caffe Mocha", inventory);
	}

	@Override
	public void setRecipe() {
		addIngredient("Espresso", 1);
		addIngredient("Cocoa", 1);
		addIngredient("Steamed Milk", 1);
		addIngredient("Whipped Cream", 1);
	}

}

//////////////////////////////////////////////


class CappuccinoRecipe extends ProductRecipe {

	public CappuccinoRecipe(InventoryService inventory) {
		super("Cappuccino", inventory);
	}

	@Override
	public void setRecipe() {
		addIngredient("Espresso", 2);
		addIngredient("Steamed Milk", 1);
		addIngredient("Foamed Milk", 1);
	}

}

//////////////////////////////////////////////





