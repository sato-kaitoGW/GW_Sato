package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
      @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		//送信されてくるパラメーターのエンコーディングの指定
  		req.setCharacterEncoding("UTF-8");
  		//送信したパラメーターの取得
  		String a=req.getParameter("param");
  		String b=req.getParameter("param1");
  		String c=req.getParameter("param2");
  		String d=req.getParameter("param3");
  		String e=req.getParameter("param4");
  		String f=req.getParameter("param5");
  		String g=req.getParameter("param6");
  		//エンコーディングとMIMEタイプの設定
  	    resp.setContentType("text/html; charset = UTF-8");
  	    //ServletでHTMLを書くための準備をしている
  	    PrintWriter out =resp.getWriter();
  	     //変数名.の形式でHTMLがかけるよ！
  	    out.println("<html>");
  	    out.println("<head>");
  	    out.println("<body>");
  	    out.println("<h1>名前:"+a+"</h1>");
  	  out.println("<h1>年齢:"+b+"</h1>");
  	out.println("<h1>性別:"+c+"</h1>");
  	out.println("<h1>興味のある言語:"+"</h1>");
  	if(req.getParameter("param3")==null) {

  	}else {
  		out.println("<h2>"+d+"</h2>");
  	}
	if(req.getParameter("param5")==null) {

  	}else {
  		out.println("<h2>"+f+"</h2>");
  	}
	if(req.getParameter("param6")==null) {

  	}else {
  		out.println("<h2>"+g+"</h2>");
  	}

  	out.println("<h1>なにか一言:"+e+"</h1>");
  	    out.println("</body>");
  	    out.println("</head>");
  	    out.println("</html>");
  	    //HTMLに満足したらcloseしてね
  	    out.close();

    }
}
