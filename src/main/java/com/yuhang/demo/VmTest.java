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
	
	static String token="ICPHq1OowtPP8SkjFppANCY/zCWk57+iM/lubo7P/x+7DUU6BkX7lc3+zayHVoT2";

	public static void main(String[] args) throws Exception {
//		String result = login();
//		String result =getAllWarehouse();
//		String result = addWarehouse();
//		String result = getProductInfoBySn();
//		String result =test();
//		String result =addWorkStoreProduct();
		String result =storeList();
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
//		String result = productgetSn();
//		String result =commongetBarcodeLog();
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
		formparams.add(new BasicNameValuePair("json", "[{\"color\":\"黑色\",\"productId\":58491,\"quantity\":5,\"size\":\"34\"}]"));
		formparams.add(new BasicNameValuePair("productId", "58491"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String productlist() throws Exception {
		String url = api + "/api/product/list";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String queryQuickStock() throws Exception {
		String url = api + "/api/sale/queryQuickStock";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("productId", "1"));
		formparams.add(new BasicNameValuePair("color", "红"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String getColorListByArtNo() throws Exception {
		String url = api + "/api/sale/getColorListByArtNo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("artNo", "1"));
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
		formparams.add(new BasicNameValuePair("sn", "80232132131"));
		return PostUtil.httpPost(url, formparams);
	}
	
	public static String addWorkStoreProduct() throws Exception {
		String url = api + "/api/store/addWorkStoreProduct";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("warehouseId", 2+""));
		 
		formparams.add(new BasicNameValuePair("sns", "100000025,100000026,100000027,100000028,100000029"));
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
		formparams.add(new BasicNameValuePair("password", "2676aa71420e0a06b82ee5a061e061811"));
		return PostUtil.httpPost(url, formparams);
	}
}
