package com.yh.decorator;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class ClientBar {

	public static void main(String[] args) throws FileNotFoundException {

		Drink order = new Coco(new EspCoffe());

		System.out.println(order.getDes());
		System.out.println(order.cost());
		
		
		new DataInputStream( new FileInputStream(new File("")));
		
	}
}
