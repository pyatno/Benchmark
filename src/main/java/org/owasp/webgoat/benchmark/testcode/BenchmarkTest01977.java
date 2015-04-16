package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest01977")
public class BenchmarkTest01977 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String param = "";
		java.util.Enumeration<String> headerNames = request.getHeaderNames();
		if (headerNames.hasMoreElements()) {
			param = headerNames.nextElement(); // just grab first element
		}
		
		
		String bar = "safe!";
		java.util.HashMap<String,Object> map35240 = new java.util.HashMap<String,Object>();
		map35240.put("keyA-35240", "a Value"); // put some stuff in the collection
		map35240.put("keyB-35240", param.toString()); // put it in a collection
		map35240.put("keyC", "another Value"); // put some stuff in the collection
		bar = (String)map35240.get("keyB-35240"); // get it back out
		
		
		javax.servlet.http.Cookie cookie = new javax.servlet.http.Cookie("SomeCookie","SomeValue");
		
		cookie.setSecure(true);
		
		response.addCookie(cookie);
	}
}