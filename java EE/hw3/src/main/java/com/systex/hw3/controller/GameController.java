package com.systex.hw3.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.LinkedList;

import com.systex.hw3.model.GuessGame;


/**
 * Servlet implementation class GameController
 */
public class GameController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession();
		int range;
		try {
			range = Integer.parseInt(request.getParameter("range"));
			range = (range <= 10) ? range : 10;
		}
		catch (NumberFormatException e) {
			range = 10;
		}
		int remains = (range / 5) + 1;  
		GuessGame a = new GuessGame(range, remains);
		
		session.setAttribute("range", range);
		session.setAttribute("guessGame", a);
		session.setAttribute("remains", a.getRemains());
		request.getRequestDispatcher("/game/guess.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		LinkedList<String> errorMsg = new LinkedList<String>();
		String pathGame = "/game/guess.jsp";
		String pathWin = "/game/youWin.jsp";
		String pathLose = "/game/youLose.jsp";
		int guess = 0;
		
		try {
			guess = Integer.parseInt(request.getParameter("guess"));
		}
		catch (NumberFormatException e) {
			guess = -1;
		}
		
		if(guess <= 0 || guess >= (int)session.getAttribute("range")) {
			errorMsg.add("請輸入範圍內數字");
		}
		
		if(!errorMsg.isEmpty()) {
			request.setAttribute("errors", errorMsg);
			request.getRequestDispatcher(pathGame).forward(request, response);
			return;
		}
		
		GuessGame a = (GuessGame)session.getAttribute("guessGame");
		if(a.guess(guess)) {
			request.getRequestDispatcher(pathWin).forward(request, response);
			return;
		}
		
		if(a.getRemains() == 0) {
			request.setAttribute("luckyNumber", (int)a.getLuckyNumber());
			request.getRequestDispatcher(pathLose).forward(request, response);
			return;
		}
		
		session.setAttribute("remains", a.getRemains());
		request.getRequestDispatcher(pathGame).forward(request, response);
		return;
			
		
	}
}
