package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session2Servlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	//エンコーディングとMIMEタイプの設定
response.setContentType("text/html;charset=Windows-31J");
//ServletでHTMLを書くための準備をしている
PrintWriter out = response.getWriter();
//変数名.の形式でHTMLがかけるよ！
out.println("<html>");
out.println("<head><title>Session Servlet 2</title></head>");
out.println("<body>");
out.println("<h1>Session Servlet 2</h1>");
//セッションが継続していないのでエラー処理を行う
HttpSession session = request.getSession(false);
if (session == null) {
out.println("<p>セッションが開始されていません</p>");
out.println("</body>");
out.println("</html>");
return;
}
//セッションが正常に継続している場合の処理
out.println("<p>セッションが継続しています</p>");
out.println("<p>"+session.getAttribute("loginUser")+"</p>");
out.println("</body>");
out.println("</html>");
}
}
