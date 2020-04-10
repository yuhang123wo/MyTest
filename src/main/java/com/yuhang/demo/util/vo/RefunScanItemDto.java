package com.yuhang.demo.util.vo;

import java.math.BigDecimal;

public class RefunScanItemDto {
	private long itemId; // 商品Id

	private String artNo; // 货号

	private String color; // 颜色

	private String size; // 尺码

	private long supplierId; // 厂商ID

	private String supplierName; // 厂商名

	private String supplierAddress; // 厂商地址

	private int quantity; // 数量

	private BigDecimal price; // 单价

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getArtNo() {
		return artNo;
	}

	public void setArtNo(String artNo) {
		this.artNo = artNo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
