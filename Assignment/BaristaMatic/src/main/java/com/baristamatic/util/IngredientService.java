package com.baristamatic.util;

public class IngredientService extends Product implements Cloneable {

	@Override
	public IngredientService clone() throws CloneNotSupportedException {
		return clone();
	}

	private Product drink;
	private int rate;

	protected IngredientService(String name, int rate) {
		super(name);
		this.rate = rate;
	}

	public Product addIngredient(Product drink) {
		this.drink = drink;
		return this;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public int cost() {
		if (drink != null) {
			return rate + drink.cost();
		} else {
			return rate;
		}
	}


}
