package com.systex.hw3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import com.systex.hw3.model.LotteryService;

/**
 * Servlet implementation class LotteryController
 */
public class LotteryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LotteryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		LinkedList<String> errorMsgs = new LinkedList<String>();
		
		try {
			String excludeNums = request.getParameter("excludeNums");
			int times = Integer.valueOf(request.getParameter("times"));
			
			int[] arrNums = Arrays
	        		.stream(excludeNums.split(","))
	        		.mapToInt(Integer::parseInt)
	        		.toArray();
			
	 		LotteryService a = new LotteryService(arrNums);
	 		ArrayList<int[]> allNums = a.writeBingo(times);
	 		String strExcludeNums = a.getStrExcludeNum();
	 		
	 		request.setAttribute("allNums", allNums);
	 		request.setAttribute("times", times);
	 		request.setAttribute("excludeNums", strExcludeNums);
	 		
	 		request.getRequestDispatcher("/lottery/result.jsp")
	 		.forward(request, response);
		}
 		catch (NumberFormatException e) {
			errorMsgs.add("輸入了無效的數字 " + e);
			request.setAttribute("errors", errorMsgs);
			request.getRequestDispatcher("/lottery/lottery.jsp")
			.forward(request, response);
		}
		

	}

}
