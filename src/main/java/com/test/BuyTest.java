package com.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.yuhang.demo.util.PostUtil;

public class BuyTest {

	public static String api = "http://localhost:8080/buyers-show";
	
//	public static String api="http://apibshow.go2b2b.com";
	
	public static String createShow() throws Exception {

		String url = api + "/bshow/common/createShow";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId",265 );
		params.put("productId", 1481612);
		params.put("artNo", "创意·雨燕&199-3");
		params.put("supplierId",265 );
		params.put("supplierName", "创意·雨燕");
		params.put("type",1 );
		params.put("price", 23.15);
		params.put("quantity", 1);
		params.put("remark", "买家秀要求");
		params.put("startTime", "2020-03-09");
		params.put("endTime", "2020-03-09");
		params.put("appoint", "59722");
		params.put("appointName", "nickName");
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	

	public static String payShow() throws Exception {

		String url = api + "/buyers-show/bshow/common/payShow";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId",265 );
		params.put("showId", 22);
		params.put("payType", 0);
		params.put("payword", "0e4cab24f4b78cb785875f856c08a760");
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	
	public static String orderPlazaList() throws Exception {

		String url = api + "/buyers-show/bshow/2b/orderPlazaList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("type", 0);
		params.put("userId", 59722);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}

	public static String takeBuyersShowOrder() throws Exception {

		String url = api + "/buyers-show/bshow/2b/takeBuyersShowOrder";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("bShowId", 18);
		params.put("userId", 59722);
		params.put("nickName", "用户昵称");
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}

	public static String buyersShowOrderList() throws Exception {

		String url = api + "/buyers-show/bshow/2b/buyersShowOrderList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 59722);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}

	public static String getBuyersShowDetail() throws Exception {

		String url = api + "/buyers-show/bshow/2b/getBuyersShowDetail";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("bShowId", 16);
		params.put("userId", 59722);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}

	public static String getMytalentsData() throws Exception {

		String url = api + "/bshow/common/getMytalentsData";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderUsers", "55934,123,2345,567");
		params.put("userId", 414979);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	public static String getBuyersShowHis() throws Exception {

		String url = api + "/buyers-show/bshow/2b/getBuyersShowHis";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderId", "4");
		params.put("userId", 59722);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	public static String cancelBuyerShowOrder() throws Exception {

		String url = api + "/buyers-show/bshow/2b/cancelBuyerShowOrder";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderId", "4");
		params.put("userId", 59722);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	public static String platfrombuyersShowOrderList() throws Exception {

		String url = api + "/buyers-show/bshow/platform/buyersShowOrderList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
//		params.put("supplierName", "创意");
		params.put("settleState", "1");
		return PostUtil.httpApp(url, params);
	}

	public static String buyersShowList() throws Exception {

		String url = api + "/buyers-show/bshow/platform/buyersShowList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
//		params.put("supplierName", "创意");
		params.put("pageSize", "100");
		return PostUtil.httpApp(url, params);
	}
	
	public static String uploadShow() throws Exception {

		String url = api + "/buyers-show/bshow/2b/uploadShow";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
		params.put("userId", "59722");
		params.put("orderId", "5");
		params.put("workId", "122");
		params.put("images", "2142142");
		params.put("zip", "4242");
		return PostUtil.httpApp(url, params);
	}
	
	
	public static String auditShow() throws Exception {

		String url = api + "/buyers-show/bshow/common/auditShow";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
		params.put("userId", "265");
		params.put("orderId", "5");
		params.put("type", "0");
		params.put("reason", "0000");
		return PostUtil.httpApp(url, params);
	}
	
	public static String applyService() throws Exception {

		String url = api + "/buyers-show/bshow/common/applyService";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
		params.put("userId", "265");
		params.put("orderId", "5");
		params.put("reason", "测试测试");
		return PostUtil.httpApp(url, params);
	}
	
	public static String settedShow() throws Exception {

		String url = api + "/buyers-show/bshow/platform/settedShow";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
		params.put("orderId", "5");
		params.put("type", "1");
		params.put("reason", "测试测试");
		params.put("operatorId", "1");
		params.put("operatorName", "客服1");
		return PostUtil.httpApp(url, params);
	}
	public static String getTradeList() throws Exception {

		String url = api + "/buyers-show/bshow/platform/getTradeList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	public static String refuseBuyerShowOrder() throws Exception {

		String url = api + "/buyers-show/bshow/2b/refuseBuyerShowOrder";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("showId", 22);
		params.put("userId", 59722);
		params.put("nickName", "用户昵称");
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	public static String pubList() throws Exception {

		String url = api + "/bshow/common/pubList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 265);
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	
	public static String tradeList() throws Exception {

		String url = api + "/bshow/common/tradeList";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 6324);
//		params.put("orderNo", "82020032002");
		params.put("pageSize", 10);
		params.put("username", "gan");
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	public static String getProductBuyersData() throws Exception {

		String url = api + "/bshow/common/getProductBuyersData";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userId", 6324);
		params.put("productIds", "1801731,1801730,1");
		params.put("timestamp", new Date().getTime());
		return PostUtil.httpApp(url, params);
	}
	
	 
	public static void main(String[] args) {

		try {
//			 String result = orderPlazaList();//接单广场
//			 String result = getBuyersShowDetail();
//			 String result = takeBuyersShowOrder();
//			 String result =buyersShowOrderList();
//			String result = getMytalentsData();
//			String result =getBuyersShowHis();
//			String result =cancelBuyerShowOrder();
//			String result = createShow();
//			 String result = payShow();
//			 String result = platfrombuyersShowOrderList();
//			 String result =  buyersShowList();
//			 String result =   uploadShow();
//			 String result =  auditShow();
//			 String result =   applyService();
//			 String result =   settedShow();
//			 String result =   getTradeList();
//			 String result =  refuseBuyerShowOrder();
//			String result = pubList();
			String result=tradeList();
//			String result =getProductBuyersData();
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
