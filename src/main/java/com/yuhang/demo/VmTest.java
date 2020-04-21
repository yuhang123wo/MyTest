package com.yuhang.demo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.yuhang.demo.util.PostUtil;

public class VmTest {

//	static String api = "http://localhost:36062";
//	http://apivmi.go2b2b.com:36063/

	static String api = "http://apivmi.go2b2b.com:36062";
//	static String api = "xxxhttps://vmi.gsb68.com";
//	Vu1DTuHmI19wW1tNUhHNJ6Qs+oTjFX3wFqd5himRMueBQ+XbwcLITnjwzMBDMFme
	static String token="pUh7qDHf6S+6SFFDWflbJPmDaQZ2fWIyGKSquRw1HdnfYnPNzPJPrLNTbj/7dcdY";
//	static String token="wytBlqBBtf786bDC93H+8k1+SBPdPNT7Cf/IRiA1FPU4874dsi8ced7y3La6Hbgk";
//DyMCsZXuuraCa4r8U6Wm1SKdKiNygM7OmV6QhnjRqGvd9hgnr+N2baNDZZO/oz4x
	public static void main(String[] args) throws Exception {
//		String result = login();
//		String result =getDebugTag();
//		String result =setDebugTag();
//		String result =getAllWarehouse();
//		String result = addWarehouse();
//		String result = getProductInfoBySn();
//		String result = info();
//		String result =test();
//		String result =addWorkStoreProduct();
//		String result =storeList();
//		String result =getProductInfoByArtNo();
//		String result=storeDetailList();
//		String result=queryStock();
//		String result=backgetProductSnList();
//		String result =backgetCategoryList();
//		String result =backgetFlowRecordList();
//		String result =backgetStockList();
//		String result = backgetBarcodeLog();
//		String result = backgetBarcodeLog();
//		String result = getColorListByArtNo();
//		String result = queryQuickStock();
//		String result = productlist();
//		String result =	detail();
//		String result = productgetSn();
//		String result =commongetBarcodeLog();
//		String result =addCustomer();
//		String result =updateCustomer();
//		String result =customerList();
//		String result=searchCustomerList();
//		String result =queryCustomerByName();
//		String result =queryGo2UserByMobile();
//		String result = revokeStoreProduct();
//		String result =changeStockNum();
//		String result =getRefundProductInfoBySn();
		String result =saleOut();
		System.out.println(result);
	}
	
	
	public static String commongetBarcodeLog() throws Exception {
		String url = api + "/api/common/getBarcodeLog";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("sn", "100000002"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String productgetSn() throws Exception {
		String url = api + "/api/product/getSn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("json", "[{\"color\":\"黑色\",\"productId\":58491,\"quantity\":1,\"size\":\"34\"}]"));
		formparams.add(new BasicNameValuePair("productId", "58491"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String productlist() throws Exception {
		String url = api + "/api/product/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("pageSize", "10"));
		formparams.add(new BasicNameValuePair("pageNo", "19"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String detail() throws Exception {
		String url = api + "/api/product/detail/11";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String queryQuickStock() throws Exception {
		String url = api + "/api/sale/queryQuickStock";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
//		formparams.add(new BasicNameValuePair("productId", "1176072"));
		formparams.add(new BasicNameValuePair("color", "军绿色"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getColorListByArtNo() throws Exception {
		String url = api + "/api/sale/getColorListByArtNo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("artNo", "D230"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String backgetBarcodeLog() throws Exception {
		String url = api + "/backstage/getBarcodeLog";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("barcodeId", "100000002");
//		params.put("status", "创意");
		return PostUtil.httpAppVm(url, params);
	}
	public static String backgetCategoryList() throws Exception {
		String url = api + "/backstage/getCategoryList";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("sn", "1");
		params.put("supplierName", "创意");
//		params.put("status", "创意");
		return PostUtil.httpAppVm(url, params);
	}
	
	public static String backgetFlowRecordList() throws Exception {
		String url = api + "/backstage/getFlowRecordList";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("sn", "1");
		params.put("supplierName", "1");
		params.put("pageSize", "1");
		params.put("status", "PRODUCE");
		return PostUtil.httpAppVm(url, params);
	}
	
	
	public static String backgetStockList() throws Exception {
		String url = api + "/backstage/getStockList";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("sn", "1");
		params.put("supplierName", "1");
//		params.put("status", "创意");
		return PostUtil.httpAppVm(url, params);
	}
	
	public static String backgetProductSnList() throws Exception {
		String url = api + "/backstage/getProductSnList";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("sn", "1");
		params.put("supplierName", "创意");
//		params.put("status", "创意");
		return PostUtil.httpAppVm(url, params);
	}
	
	public static String queryStock() throws Exception {
		String url = api + "/api/store/queryStock";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String storeDetailList() throws Exception {
		String url = api + "/api/store/storeDetailList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("storeId", "15"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String storeList() throws Exception {
		String url = api + "/api/store/storeList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("payType", "ALI"));
		formparams.add(new BasicNameValuePair("endTime", "2020-04-11"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getProductInfoByArtNo() throws Exception {
		String url = api + "/api/product/getProductInfoByArtNo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("artNo", "1"));
		formparams.add(new BasicNameValuePair("limitNum", "1"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String test() throws Exception {
		String url = api + "/api/store/test";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getProductInfoBySn() throws Exception {
		String url = api + "/api/store/getProductInfoBySn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("sn", "80232132131,100000063"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String info() throws Exception {
		String url = api + "/api/product/info";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("sn", "80232132131,100000063"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String addWorkStoreProduct() throws Exception {
		String url = api + "/api/store/addWorkStoreProduct";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("warehouseId", 2+""));
		formparams.add(new BasicNameValuePair("sns", "100000364"));
		formparams.add(new BasicNameValuePair("payType", "ALI"));
		formparams.add(new BasicNameValuePair("remark", token));
		return PostUtil.httpPost(url, formparams);
	}
	
 
	public static String getAllWarehouse() throws Exception {
		String url = api + "/api/store/getAllWarehouse";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("username", "创意·雨燕"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	
	public static String login() throws Exception {
		String url = api + "/login";
		
		
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
//		formparams.add(new BasicNameValuePair("username", "创意·雨燕"));
//		formparams.add(new BasicNameValuePair("password", "T1Hj745M7n2a"));
		formparams.add(new BasicNameValuePair("username", "160b7fca7dfb76fcd7fef3e25340458f"));
		formparams.add(new BasicNameValuePair("password", "74d266ab7f4cba76b7b1c90f948b9403"));
		return PostUtil.httpPost(url, formparams);
		
	}
	
	public static String addCustomer() throws Exception {
		String url = api + "/api/customer/addCustomer";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "dpc0827"));
		formparams.add(new BasicNameValuePair("goUserId", "59722"));
		formparams.add(new BasicNameValuePair("phone", "1236788"));
		formparams.add(new BasicNameValuePair("userName", "dpc0827"));
		formparams.add(new BasicNameValuePair("remark", "test"));
		
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String queryCustomerByName() throws Exception {
		String url = api + "/api/customer/queryCustomerByName";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "dpc0827"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String queryGo2UserByMobile() throws Exception {
		String url = api + "/api/customer/queryGo2UserByMobile";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("mobile", "1236788"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String revokeStoreProduct() throws Exception {
		String url = api + "/api/store/revokeStoreProduct";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("storeId", "49"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String changeStockNum() throws Exception {
		String url = api + "/api/product/changeStockNum";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("productId", "58491"));
		formparams.add(new BasicNameValuePair("color", "黑色"));
		formparams.add(new BasicNameValuePair("size", "34"));
		formparams.add(new BasicNameValuePair("warehouseId", "2"));
		formparams.add(new BasicNameValuePair("num", "1"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String updateCustomer() throws Exception {
		String url = api + "/api/customer/updateCustomer";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("id", "6"));
		formparams.add(new BasicNameValuePair("userId", "59722"));
		formparams.add(new BasicNameValuePair("phone", "1236788"));
		formparams.add(new BasicNameValuePair("userName", "dpc0827"));
		formparams.add(new BasicNameValuePair("remark", "test"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String customerList() throws Exception {
		String url = api + "/api/customer/customerList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "d"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String searchCustomerList() throws Exception {
		String url = api + "/api/customer/searchCustomerList";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("name", "d"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	public static String getRefundProductInfoBySn() throws Exception {
		String url = api + "/api/sale/getRefundProductInfoBySn";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("sn", "100000059"));
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String saleOut() throws Exception {
		String url = api + "/api/sale/saleOut";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("warehouseId", "2"));
		formparams.add(new BasicNameValuePair("customerId", "6"));
		formparams.add(new BasicNameValuePair("json", "[{\"color\":\"黑色\",\"price\":11.0,\"productId\":58491,\"quantity\":1,\"size\":\"34\",\"sn\":\"100000364\"}]"));
		formparams.add(new BasicNameValuePair("payType", "DEBT"));
		formparams.add(new BasicNameValuePair("remark", "100000059"));
		formparams.add(new BasicNameValuePair("saleMode", "1"));
		formparams.add(new BasicNameValuePair("saleState", "0"));
		formparams.add(new BasicNameValuePair("discount", "0"));
		formparams.add(new BasicNameValuePair("extraFee", "0"));
		
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getDebugTag() throws Exception {
		String url = api + "/backstage/getDebugTag";
		Map<String,Object> params = new HashMap<String,Object>();
		return PostUtil.httpAppVm(url, params);
		
	}
	
	public static String setDebugTag() throws Exception {
		String url = api + "/backstage/setDebugTag";
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("userId", "33");
		return PostUtil.httpAppVm(url, params);
		
	}
}
