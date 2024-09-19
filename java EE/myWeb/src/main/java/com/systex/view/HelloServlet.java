package com.systex.view;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @PostConstruct
    public void doInit() {
    	System.out.println("Doint init...");
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		out.println("<h2>HelloServlet</h2>");
		out.println("<p>現在的時間是" + SimpleDateFormat.getInstance().format(new Date()) );
		out.println("<table id='tableone' border='1'>");
		out.println("<tbody>");
		
		for(int i=1; i <= 9; i++) {
			out.println("<tr>");
			for(int j=1; j <= 9; j++) {
				out.println("<td>" + i + " * " + j + " = </td><td>" + i*j + "</td>");
			}
			out.println("</tr>");
			
		}
		
		out.println("</tbody>");
		
		
		out.println("<p><image class='image1' src='" + croot + "/images/wqeqwe.jpg'/></p>");
		out.println("<p><a href='" + croot + "/index.jsp'>回首頁</a></p>");
		
//		out.println("<h2>HelloServlet</h2>");
		
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
