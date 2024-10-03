package com.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet1" })
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		out.println("<form action='/servlet1' method='post'>");
		out.println("	<label for='username'>Username</label><br>");
		out.println("	<input type='text' name='username'><br>");
		out.println("	<label for='password'>Password</label><br>");
		out.println("	<input type='password' name='password'><br>");
		out.println("	<input type='submit' value='Login'><br>");
		out.println("</form>");

		out.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		String username = req.getParameter("username");
		String password = req.getParameter("password");

//		System.out.println(username + " " + password);
//
//		if (username.equals("huuhoang") && password.equals("1234")) {
//			System.out.print("1");
//			HttpSession session = req.getSession();
//			session.setAttribute("username", username);
//			resp.sendRedirect("/dashboard");
//
//		} else {
//			System.out.println("2");
//			resp.sendRedirect("/login");
//		}

		User user = new User();

		user.setName(username);
		user.setPassword(password);

		req.setAttribute("user", user);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(10);

		req.setAttribute("collection", list);

		RequestDispatcher dispactcher = req.getRequestDispatcher("Hello.jsp");
		dispactcher.forward(req, resp);

	}
}
