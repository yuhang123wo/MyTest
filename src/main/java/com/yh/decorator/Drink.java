package com.yh.decorator;

import java.math.BigDecimal;

public abstract class Drink {

	public String des;
	private BigDecimal price = BigDecimal.ZERO;

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public abstract BigDecimal cost();
}
