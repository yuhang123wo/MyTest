package com.yh.decorator;

import java.math.BigDecimal;

public class Decorator extends Drink {

	private Drink obj;

	public Decorator(Drink obj) {
		super();
		this.obj = obj;
	}

	@Override
	public BigDecimal cost() {
		// TODO Auto-generated method stub
		return this.getPrice().add(obj.getPrice());
	}

}
