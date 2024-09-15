package com.helloworld;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/dashboard" })
public class FormUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		HttpSession session = req.getSession();

		String username = "";

		if (session != null && session.getAttribute("username") != null) {
			username = session.getAttribute("username").toString();
		}

		if (username == "") {
			resp.sendRedirect("/login");
		}

		out.close();
	}
}
