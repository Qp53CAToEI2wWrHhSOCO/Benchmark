package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest03785")
public class BenchmarkTest03785 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		java.util.Map<String,String[]> map = request.getParameterMap();
		String param = "";
		if (!map.isEmpty()) {
			param = map.get("foo")[0];
		}
		
		
		
		// Chain a bunch of propagators in sequence
		String a76644 = param; //assign
		StringBuilder b76644 = new StringBuilder(a76644);  // stick in stringbuilder
		b76644.append(" SafeStuff"); // append some safe content
		b76644.replace(b76644.length()-"Chars".length(),b76644.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map76644 = new java.util.HashMap<String,Object>();
		map76644.put("key76644", b76644.toString()); // put in a collection
		String c76644 = (String)map76644.get("key76644"); // get it back out
		String d76644 = c76644.substring(0,c76644.length()-1); // extract most of it
		String e76644 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d76644.getBytes() ) )); // B64 encode and decode it
		String f76644 = e76644.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String g76644 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g76644); // reflection
		
		
		response.getWriter().write(bar);
	}
}