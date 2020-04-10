package com.yuhang.demo.util.vo;

import java.util.List;

public class RelationDto {
	private Long id;

	private Long expressId;

	private String expressNo;

	private Long refundId;

	private List<RefunScanItemDto> list;

	private Long clerkId;

	public Long getClerkId() {
		return clerkId;
	}

	public void setClerkId(Long clerkId) {
		this.clerkId = clerkId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExpressId() {
		return expressId;
	}

	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}

	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Long getRefundId() {
		return refundId;
	}

	public void setRefundId(Long refundId) {
		this.refundId = refundId;
	}

	public List<RefunScanItemDto> getList() {
		return list;
	}

	public void setList(List<RefunScanItemDto> list) {
		this.list = list;
	}

	public boolean isRelationed() {
		return this.refundId != null && this.refundId > 0 ? true : false;
	}
}
