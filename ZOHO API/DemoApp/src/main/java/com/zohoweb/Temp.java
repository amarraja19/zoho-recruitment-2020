package com.zohoweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Temp extends HttpServlet {
	/*public void service(HttpServletRequest req, HttpServletResponse res)
	{
		int sc = Integer.parseInt(req.getParameter("num5"));
		System.out.println("Hello, have fun guys!");
	}*/
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String url = "https://invoice.zoho.in/api/v3/items";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     // optional default is GET
	     con.setRequestMethod("GET");
	     //add request header
	     con.setRequestProperty("Authorization", "Zoho-oauthtoken 1000.548f0acde797ce26091be11f076fe04d.70acbad40c5a4e46936c7f07989c0292");
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
	 	 PrintWriter out = res.getWriter();
	     out.println(response.toString());
		//URL url = new URL(“https://invoice.zoho.in/api/v3/items”); 
		
	}
	
}
