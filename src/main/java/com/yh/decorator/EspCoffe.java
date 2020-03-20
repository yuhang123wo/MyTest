package com.yh.decorator;

import java.math.BigDecimal;

public class EspCoffe extends Coffe {

	public EspCoffe() {
		setDes("itali");
		setPrice(new BigDecimal(20));
	}
}
