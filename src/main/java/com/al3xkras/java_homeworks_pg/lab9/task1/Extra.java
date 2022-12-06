package com.al3xkras.java_homeworks_pg.lab9.task1;

public class Extra implements Order {
	
	protected Order order;
	protected String extraIngredient;
	protected double extraPrice;
	
	public Extra(Order order, String extraIngredient, double extraPrice) {
		this.order = order;
		this.extraIngredient = extraIngredient;
		this.extraPrice = extraPrice;
	}

	@Override
	public String getDescription() {
		return order.getDescription() + " " + this.extraIngredient;
	}

	@Override
	public double getPrice(){
		return order.getPrice() + extraPrice;
	}

	@Override
	public String toString() {
		return "Extra{" +
				"order=" + order +
				", extraIngredient='" + extraIngredient + '\'' +
				", extraPrice=" + extraPrice +
				'}';
	}
}
