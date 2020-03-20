package com.yh.decorator;

import java.math.BigDecimal;

public class Coffe extends Drink {

	@Override
	public BigDecimal cost() {
		return super.getPrice();
	}

}
