package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest20726")
public class BenchmarkTest20726 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		org.owasp.webgoat.benchmark.helpers.SeparateClassRequest scr = new org.owasp.webgoat.benchmark.helpers.SeparateClassRequest( request );
		String param = scr.getTheValue("foo");

		String bar = doSomething(param);
		
		response.addHeader("SomeHeader", bar);
	}  // end doPost
	
	private static String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a60803 = param; //assign
		StringBuilder b60803 = new StringBuilder(a60803);  // stick in stringbuilder
		b60803.append(" SafeStuff"); // append some safe content
		b60803.replace(b60803.length()-"Chars".length(),b60803.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map60803 = new java.util.HashMap<String,Object>();
		map60803.put("key60803", b60803.toString()); // put in a collection
		String c60803 = (String)map60803.get("key60803"); // get it back out
		String d60803 = c60803.substring(0,c60803.length()-1); // extract most of it
		String e60803 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d60803.getBytes() ) )); // B64 encode and decode it
		String f60803 = e60803.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String g60803 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g60803); // reflection
	
		return bar;	
	}
}