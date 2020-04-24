package com.yuhang;

import java.util.List;

public class InverntoryPo {

	private Long productId;

	private String artNo;

	private String color;

	private String size;

	private Integer oldQuantity;

	private Integer newQuantity;

	private List<String> sn;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Integer getOldQuantity() {
		return oldQuantity;
	}

	public void setOldQuantity(Integer oldQuantity) {
		this.oldQuantity = oldQuantity;
	}

	public Integer getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(Integer newQuantity) {
		this.newQuantity = newQuantity;
	}

	public List<String> getSn() {
		return sn;
	}

	public void setSn(List<String> sn) {
		this.sn = sn;
	}

}
