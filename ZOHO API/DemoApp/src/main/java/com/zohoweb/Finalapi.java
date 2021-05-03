package com.zohoweb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL; 
//import org.json.JSONObject;

public class Finalapi {
		   
	public void call_me() throws Exception {
	     
		String url = "https://invoice.zoho.in/api/v3/items";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     // optional default is GET
	     con.setRequestMethod("GET");
	     //add request header
	     con.setRequestProperty("Authorization", "Zoho-oauthtoken 1000.36207ed595967770cf40033c693280d3.9157a77230d4f49fc05389c6ec3a8544");
	     con.setRequestProperty("Content-Type"," multipart/form-data");
	     int responseCode = con.getResponseCode();
	     System.out.println("\nSending 'GET' request to URL : " + url);
	     System.out.println("Response Code : " + responseCode);
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) 
	     {
	     	response.append(inputLine);
	     }
	     in.close();
	     //print in String
	 	 //PrintWriter out = res.getWriter();
	     //out.println(response.toString());
	     
	     /*JSONObject myresponse = new JSONObject(response.toString());
	     //System.out.println(myresponse);
	     System.out.println("message " +myresponse.getString("message"));
	     System.out.println("message "+myresponse.getJSONArray("items"));
	    // String  resultArray;
	    // resultArray =myresponse.getJSONArray("items").toString();
	     //JSONObject myresponse2 = new JSONObject(resultArray.getJ);
	     //JSONObject item_object = new JSONObject(myresponse.getJSONArray("items").toString());
	     
	     //System.out.println("items"+item_object);*/
	    		 
	}

}