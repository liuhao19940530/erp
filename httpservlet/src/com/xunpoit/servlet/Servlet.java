package com.xunpoit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends MyHttpServlet {

	@Override
	public void doGet() {
		// TODO Auto-generated method stub
		System.out.println("子类的doGet()方法。。。。。。");
	}

	@Override
	public void doPost() {
		// TODO Auto-generated method stub
		super.doPost();
	}

	public static void main(String[] args) {
		
		MyHttpServlet http = new Servlet();
		
		http.service("post");
	}

}
