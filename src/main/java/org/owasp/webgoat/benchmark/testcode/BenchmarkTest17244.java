package org.owasp.webgoat.benchmark.testcode;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BenchmarkTest17244")
public class BenchmarkTest17244 extends HttpServlet {
	
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
		

		String bar = doSomething(param);
		
		java.security.Provider[] provider = java.security.Security.getProviders();
		javax.crypto.Cipher c;

		try {
			if (provider.length > 1) {
				c = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5PADDING", java.security.Security.getProvider("SunJCE"));
			} else {
				c = javax.crypto.Cipher.getInstance("DES/CBC/PKCS5PADDING", java.security.Security.getProvider("SunJCE"));
			}
		} catch (java.security.NoSuchAlgorithmException e) {
			System.out.println("Problem executing crypto - javax.crypto.Cipher.getInstance(java.lang.String,java.security.Provider) Test Case");
			// throw new ServletException(e);
		/*} catch (java.security.NoSuchProviderException e) {
			System.out.println("Problem executing crypto - javax.crypto.Cipher.getInstance(java.lang.String,java.security.Provider) Test Case");
			// throw new ServletException(e); ok for now to swallow this */
		} catch (javax.crypto.NoSuchPaddingException e) {
			System.out.println("Problem executing crypto - javax.crypto.Cipher.getInstance(java.lang.String,java.security.Provider) Test Case");
			// throw new ServletException(e);
		}
		response.getWriter().println("Crypto Test javax.crypto.Cipher.getInstance(java.lang.String,java.security.Provider) executed");
	}  // end doPost
	
	private static String doSomething(String param) throws ServletException, IOException {

		// Chain a bunch of propagators in sequence
		String a45087 = param; //assign
		StringBuilder b45087 = new StringBuilder(a45087);  // stick in stringbuilder
		b45087.append(" SafeStuff"); // append some safe content
		b45087.replace(b45087.length()-"Chars".length(),b45087.length(),"Chars"); //replace some of the end content
		java.util.HashMap<String,Object> map45087 = new java.util.HashMap<String,Object>();
		map45087.put("key45087", b45087.toString()); // put in a collection
		String c45087 = (String)map45087.get("key45087"); // get it back out
		String d45087 = c45087.substring(0,c45087.length()-1); // extract most of it
		String e45087 = new String( new sun.misc.BASE64Decoder().decodeBuffer( 
		    new sun.misc.BASE64Encoder().encode( d45087.getBytes() ) )); // B64 encode and decode it
		String f45087 = e45087.split(" ")[0]; // split it on a space
		org.owasp.webgoat.benchmark.helpers.ThingInterface thing = org.owasp.webgoat.benchmark.helpers.ThingFactory.createThing();
		String g45087 = "barbarians_at_the_gate";  // This is static so this whole flow is 'safe'
		String bar = thing.doSomething(g45087); // reflection
	
		return bar;	
	}
}