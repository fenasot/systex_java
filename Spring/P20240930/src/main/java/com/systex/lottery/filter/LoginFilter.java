package com.systex.lottery.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
			// TODO Auto-generated method stub
	        HttpServletRequest httpRequest = (HttpServletRequest) request;
	        HttpServletResponse httpResponse = (HttpServletResponse) response;
	        HttpSession session = httpRequest.getSession(false);

	        // 獲取當前的請求路徑
	        String requestURI = httpRequest.getRequestURI();
	        String contextPath = httpRequest.getContextPath();

	        // 過濾首頁與 login、login內、resouce 以外的頁面
	        if (requestURI.endsWith("/") 
	        		|| requestURI.startsWith(contextPath + "/login")
	        		|| requestURI.startsWith(contextPath + "/resource")
    		) {
	            // 繼續後續的處理
	            chain.doFilter(request, response);
	            return;
	        }

	        System.out.println("拒絕登入");

	        if (session == null || session.getAttribute("user") == null) {
		        // 沒有session 就跳轉到 login 頁面
	            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
	        } else {
	        	// 或是繼續後續處理
	            chain.doFilter(request, response);
	        }
	    }
	

}
