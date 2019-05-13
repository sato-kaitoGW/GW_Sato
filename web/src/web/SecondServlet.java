package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//送信されてくるパラメーターのエンコーディングの指定
		req.setCharacterEncoding("UTF-8");
		//送信したパラメーターの取得
		String x=req.getParameter("param");
		//エンコーディングとMIMEタイプの設定
	    resp.setContentType("text/html; charset = UTF-8");
	    //ServletでHTMLを書くための準備をしている
	    PrintWriter out =resp.getWriter();
	     //変数名.の形式でHTMLがかけるよ！
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<body>");
	    out.println("<h1>"+x+"</h1>");
	    out.println("</body>");
	    out.println("</head>");
	    out.println("</html>");
	    //HTMLに満足したらcloseしてね
	    out.close();

	}
}
