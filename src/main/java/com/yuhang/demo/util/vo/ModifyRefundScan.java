package com.yuhang.demo.util.vo;

import java.util.List;

public class ModifyRefundScan {
	private long id;

	private String remark;

	private List<ModifyRefundScanItem> list;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<ModifyRefundScanItem> getList() {
		return list;
	}

	public void setList(List<ModifyRefundScanItem> list) {
		this.list = list;
	}
	
	
}
