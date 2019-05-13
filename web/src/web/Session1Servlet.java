package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1Servlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    //セッションを開始する
			HttpSession session = request.getSession(true);
			//セッションへのデータ格納
			session.setAttribute("loginUser", "KnowledgeTaro");
			//エンコーディングとMIMEタイプの設定
			response.setContentType("text/html;charset=Windows-31J");
			//ServletでHTMLを書くための準備をしている
			PrintWriter out = response.getWriter();
			//変数名.の形式でHTMLがかけるよ！
			out.println("<html>");
			out.println("<head><title>Session Servlet 1</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet 1</h1>");
			out.println("<p>セッションを開始しました</p>");
			out.println("</body>");
			out.println("</html>");
	}

}
