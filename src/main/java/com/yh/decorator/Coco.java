package com.yh.decorator;

import java.math.BigDecimal;

public class Coco extends Decorator {

	public Coco(Drink obj) {
		super(obj);
		setDes("coco");
		setPrice(new BigDecimal(20));
	}

}
