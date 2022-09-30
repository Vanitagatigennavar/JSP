package com.xworkz.water;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(loadOnStartup = 12,urlPatterns = "/***")
public class WaterServlet extends HttpServlet {

	public WaterServlet() {
		System.out.println("creating the default consTructor");
	}
	
	

}
