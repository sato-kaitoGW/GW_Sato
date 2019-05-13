package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session3Servlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
	//セッションが継続していないのでエラー処理を行う
HttpSession session = request.getSession(false);
if (session != null) {
	//セッションの終了
session.invalidate();
}
//セッションが正常に継続している場合の処理
//エンコーディングとMIMEタイプの設定
response.setContentType("text/html;charset=Windows-31J");
//ServletでHTMLを書くための準備をしている
PrintWriter out = response.getWriter();
//変数名.の形式でHTMLがかけるよ！
out.println("<html>");
out.println("<head><title>Session Servlet 3</title></head>");
out.println("<body>");
out.println("<h1>Session Servlet 3</h1>");
out.println("<p>セッションを終了しました</p>");
out.println("</body>");
out.println("</html>");
}
}
