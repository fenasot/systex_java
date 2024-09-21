package com.systex.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.LinkedList;

import com.systex.model.Customer;

/**
 * Servlet implementation class CreateCustomer
 */
public class CreateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		action = action == null ? "cc1" : action;
		switch(action) {
		case "cc1":
			processCC1(request, response);
			break;
		case "cc2":
			processCC2(request, response);
			break;
		}	
	}

	private void processCC2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
		LinkedList<String> errorMsgs = new LinkedList<String>();;
		request.setAttribute("errors", errorMsgs);
		
		// 1. Retrieve form data
		// 2. Convert form data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String address = request.getParameter("address");
		String birth = request.getParameter("birth");
		String gender = request.getParameter("gender");
		String[] habits = request.getParameterValues("habits");


		

		// 3. Validata form data
		if(name == null || name.trim().isEmpty()) {
			errorMsgs.add("姓名欄位必須填寫");
		}

		if(email == null || email.trim().isEmpty()) {
			errorMsgs.add("信箱欄位必須填寫");
		}
		
		if(telephone == null || telephone.trim().isEmpty()) {
			errorMsgs.add("電話欄位必須填寫");
		}
		
		if(address == null || address.trim().isEmpty()) {
			errorMsgs.add("地址欄位必須填寫");
		}
		
		if(birth == null || birth.trim().isEmpty()) {
			errorMsgs.add("請選擇您的生日");
		}
		
		if(gender == null || gender.trim().isEmpty()) {
			errorMsgs.add("請都選性別");
		}
		
		if(habits == null) {
			errorMsgs.add("請至少勾選一項興趣");
		}
		
		if(!errorMsgs.isEmpty()) {
			
			view = request.getRequestDispatcher("createCustomer2.jsp");
			view.forward(request, response);
			return; // 把控制權還給controller
		}

		// 4. Invoke Biz Logic
		try {
			HttpSession session = request.getSession();
			Customer cust = (Customer) session.getAttribute("cust");
			cust.setBirth(birth);
			cust.setGender(gender);
			cust.setHabits(habits);
			request.setAttribute("cust", cust);  //request scope
			
			view = request.getRequestDispatcher("createSuccessful.jsp");
			view.forward(request, response);
			
		} catch(Exception e) {
			errorMsgs.add(e.getMessage());
			view = request.getRequestDispatcher("createCustomer2.jsp");
			view.forward(request, response);
		}
	}

	private void processCC1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
//		request.setCharacterEncoding("UTF-8");
		RequestDispatcher view;
		LinkedList<String> errorMsgs = new LinkedList<String>();;
		request.setAttribute("errors", errorMsgs);
		// TODO Auto-generated method stub
		// 1. Retrieve form data
		// 2. Convert form data
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String address = request.getParameter("address");

		// 3. Validata form data
		if(name == null || name.trim().isEmpty()) {
			errorMsgs.add("姓名欄位必須填寫");
		}

		if(email == null || email.trim().isEmpty()) {
			errorMsgs.add("信箱欄位必須填寫");
		}
		
		if(telephone == null || telephone.trim().isEmpty()) {
			errorMsgs.add("電話欄位必須填寫");
		}
		
		if(address == null || address.trim().isEmpty()) {
			errorMsgs.add("地址欄位必須填寫");
		}
				
		if(!errorMsgs.isEmpty()) {
			
			view = request.getRequestDispatcher("createCustomer1.jsp");
			view.forward(request, response);
			return; // 把控制權還給controller
		}

		// 4. Invoke Biz Logic
		try {
			Customer cust = new Customer();
			cust.setName(name);
			cust.setEmail(email);
			cust.setTelephone(telephone);
			cust.setAddress(address);
			request.setAttribute("cust", cust);  //request scope
			
			view = request.getRequestDispatcher("createCustomer2.jsp");
			view.forward(request, response);
			
		} catch(Exception e) {
			errorMsgs.add(e.getMessage());
			view = request.getRequestDispatcher("createCustomer1.jsp");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
