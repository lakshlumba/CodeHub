package practise.brainteaser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstExample extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		handleRequest(request,response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		handleRequest(request,response);
	}
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		Enumeration<String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String headerName = headerNames.nextElement();
			out.write(headerName);
			out.println("\n");
			Enumeration<String> headerValues = request.getHeaders(headerName);
			while(headerValues.hasMoreElements()){
				String headerValue = headerValues.nextElement();
				out.write("\t" + headerValue);
				out.write("\n");
			}
		}
	}

}
