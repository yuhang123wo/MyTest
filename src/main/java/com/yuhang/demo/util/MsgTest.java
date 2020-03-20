package com.yuhang.demo.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yuhang.demo.PmTest;

public class MsgTest {
	private static String token = "73cffac5-b976-42d1-bb7d-5180d8c2f79e";

	public static String getBroadcastMsg(long serviceId) throws IOException {
		String url = PmTest.api + "/wintake/broad/getBroadcastMsg";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("serviceId", serviceId+""));
		return PostUtil.httpPost(url, formparams);
	}

	// win_take_auth_key_ff34b28b-953b-413a-a02c-e809e00fa653
	public static String getRecvInfo() throws IOException {
		String url = PmTest.api + "/wintake/broad/getRecvInfo";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static String wintakelogout() throws Exception {
		String url = PmTest.api + "/wintake/logout";
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("token", token));
		formparams.add(new BasicNameValuePair("pageSize", "1"));
		return PostUtil.httpPost(url, formparams);
	}

	public static void main(String[] args) throws IOException {

		long serviceId = 0;
		while (true) {
			String result = getBroadcastMsg(serviceId);
			
			Map obj = JSONObject.parseObject(result, Map.class);
			Map mp = JSONObject.parseObject(obj.get("data").toString(), Map.class);
			long tmp =Long.parseLong(mp.get("serviceId").toString());
			
			if(tmp!=serviceId){
				serviceId = tmp;
				
				System.out.println("取到新的"+result);
			}else{
				System.out.println("未取到新的");
			}
			try {
				Thread.sleep(1000 * 5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
