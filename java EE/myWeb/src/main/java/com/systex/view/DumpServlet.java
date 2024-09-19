package com.systex.view;

import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * Servlet implementation class DumpServlet
 */
public class DumpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DumpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String croot = request.getContextPath();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>HelloServlet</title>");
		out.println("<link href=\"" + croot + "/style/myStyle.css\" rel=\"stylesheet\"></link>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>dump</h2>");
		out.println("<p>現在的時間是" + SimpleDateFormat.getInstance().format(new Date()) + "</p>");
		request.setCharacterEncoding("utf-8");
		
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<table id='tableone' border='1' style='margin: auto; width: 75%;'>");
		out.println("<thead><tr><th>Header Name</th><th>Header Value</th></tr></thead>");
		out.println("<tbody>");
		while(headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println("<tr><td>" + headerName + "</td><td>" + headerValue + "</td></tr");
		}
		out.println("</tbody>");
		out.println("</table>");
		out.println("<p></p>");
		
		
		Enumeration<String> getNames = request.getParameterNames();
		out.println("<h2>接收表單上傳資料</h2>");
		out.println("<table id='tabletwo' border='1' style='margin: auto; width: 50%;'>");
		out.println("<thead><tr><th>Name</th><th>Value</th></tr></thead>");
		out.println("<tbody>");		
		while(getNames.hasMoreElements()) {
			String getName = getNames.nextElement();
			String[] getValue = request.getParameterValues(getName);
			
			int count = 0;
			for(String i : getValue) {
				out.println("<tr><td>" + getName + "[" + count + "]" + "</td><td>" + i + "</td></tr>");
				count++;
			}		
						
		}
		
		out.println("</tbody>");
		out.println("</table>");
		
		out.println("<p><a href='" + croot + "/index.jsp'>go home</a></p>");
		out.println("</body");
		out.println("</html>");
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
