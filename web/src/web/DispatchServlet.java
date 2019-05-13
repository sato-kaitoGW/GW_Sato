package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//セッションを開始
		HttpSession a=request.getSession(true);
		//sessionに格納
		//#setAttribute(オブジェクト名,インスタンス)
		a.setAttribute("name", "たかお");
		request.setAttribute("age", "20");
		    //test.jspに遷移
			RequestDispatcher rd = request.getRequestDispatcher("/test.jsp");
			rd.forward(request, response);
			}
}
