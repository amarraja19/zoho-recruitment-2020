package com.zohoweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Nextdemo extends DemoServlet {
	public void doget(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.print("Hello sq");
		
		//out.println("Result is "+k);
	}

}
