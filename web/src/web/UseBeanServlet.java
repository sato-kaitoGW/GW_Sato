package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//インスタンス生成
		EmpBean bean = new EmpBean();
		//メソッド呼び出し,setNameに値をセット
		bean.setName("KnowledgeTaro");
	    //setAgeに値をセット
		bean.setAge(20);
		//リクエストにぶち込んでる(keyがempでvalueがbeanの中身)
		req.setAttribute("emp", bean);
		//遷移先を指定している
		RequestDispatcher rd = req.getRequestDispatcher("useBean.jsp");
		//reqとrespの中身をなげている
		rd.forward(req, resp);
	}
}
