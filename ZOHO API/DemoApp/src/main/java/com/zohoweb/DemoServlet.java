package com.zohoweb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.*;

public class DemoServlet extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int en = Integer.parseInt(req.getParameter("num1"));
		int t = Integer.parseInt(req.getParameter("num2"));
		int m = Integer.parseInt(req.getParameter("num3"));
		int s = Integer.parseInt(req.getParameter("num4"));
		int sc = Integer.parseInt(req.getParameter("num5"));
		
		int k = en + t + m + s + sc;
		
		PrintWriter out = res.getWriter();
		out.println("Total: "+k);
		if((en>=35) && (t>=35) && (m>=35) && (s>=35) && (sc>=35))
		{
			out.println("PASS");
		}
		else
		{
			out.println("FAIL");
		}
		 
		
		//System.out.println("Result is "+k);
		
		
		
		
	}
	/**public void dopost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int e = Integer.parseInt(req.getParameter("num1"));
		int t = Integer.parseInt(req.getParameter("num2"));
		int m = Integer.parseInt(req.getParameter("num3"));
		int s = Integer.parseInt(req.getParameter("num4"));
		int sc = Integer.parseInt(req.getParameter("num5"));
		
		int k;
		
		System.out.println("Result is "+k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		
		
	}
	 * /
	/*
	 * public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		System.out.println("Result is "+k);
		
		PrintWriter out = res.getWriter();
		out.println("Result is "+k);
		
	}*/
}
