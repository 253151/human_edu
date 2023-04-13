package pack01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/human003")
public class Human03 extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
		
		req.setCharacterEncoding("UTF-8");
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = res.getWriter();
		
		int intCnt = 0;
		String strCnt = req.getParameter("cnt");
		// Parameter로 받는 데이터는 문자열로 들어오게 됨.
		if (strCnt!=null && !strCnt.equals("")) {
		intCnt = Integer.parseInt(strCnt);	// 정수형으로 변환
		}
		
		for (int i=0; i<intCnt; i++) {
//			out.println("<h1>Hello JAVA</H1>");
			out.println("<h"+i+">Hello JAVA</H"+i+">");
		}
		
	}
}
