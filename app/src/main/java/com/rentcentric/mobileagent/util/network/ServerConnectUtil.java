package com.rentcentric.mobileagent.util.network;

import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.IOException;

public class ServerConnectUtil {

	private HttpClient httpClient;
	private HttpGet httpGet;
	private HttpPost httpPost;
	private HttpResponse httpResponse;
	private JSONObject jsonObj;
	private int method;
	private String url;

	public ServerConnectUtil(String url, JSONObject jsonObj, int method) {
	
		System.out.println("SEARCH URL:"+url);
		Log.i("url", url+"");
		this.url = url;
		this.jsonObj = jsonObj;
		this.method = method;
		initialize();
	}

	private void initialize() {
		httpClient = new DefaultHttpClient();
		if (method == 1) {
			httpPost = new HttpPost(url);
		} else if (method == 2) {
			httpGet = new HttpGet(url);
		}
	}

	public String getResponse() {
		try {
			if (jsonObj == null && method == 2) {
				httpResponse = httpClient.execute(httpGet);
				return EntityUtils.toString(httpResponse.getEntity());
			} else if (method == 1) {
				//httpPost.setEntity(new UrlEncodedFormEntity(parameter,"UTF-8"));
				httpPost.setEntity(new StringEntity(jsonObj.toString(),"UTF-8"));
				httpPost.setHeader("Content-type", "application/json");
				httpResponse = httpClient.execute(httpPost);
				return EntityUtils.toString(httpResponse.getEntity());
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
