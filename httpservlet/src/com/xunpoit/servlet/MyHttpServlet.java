package com.xunpoit.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet的抽象父类
 * @author 讯博科技--小豪
 *since
 * 2018-9-4
  上午11:45:02

 */
public abstract class MyHttpServlet {

	public void doGet(){
		
		System.out.println("父类的doGet()方法。。。");
	}
	
	public void doPost(){
		
		System.out.println("父类的doPost()方法。。。");
	}
	
	public void service(String msg){
		
		if("get".equals(msg)){
			
			this.doGet();
			
		}else if("post".equals(msg)){
			
			this.doPost();
		}
	}
}
