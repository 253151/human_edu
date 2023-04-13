package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/human002")
public class Human02 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		req.setCharacterEncoding("UTf-8");
		res.setCharacterEncoding("UTf-8");
		res.setContentType("text/html;charset=UTF-8");
		
		System.out.println ("first Servlet~~");
		PrintWriter out = res.getWriter();
		out.println ("<h3>First Servlet~~</h3>");
		out.println("안녕하세요");
		}
}