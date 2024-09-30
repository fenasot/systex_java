<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<% 
	@SuppressWarnings("unchecked")
	LinkedList<String> errors = (LinkedList<String>)request.getAttribute("errors");
	%>
	
	<% if(errors != null) { %>
		<table style="border: 0; color: red; font-size: 10px; margin: auto; text-align: left">
			<% for(String error : errors) { %>
			<tr><td><%= error %></td></tr>
			<% } %>
		</table>
	<% } %>