import java.io *;
import java.servlet *;
import javax.servlethttp *;

public class Hello extends HttpServlet {
	public void service (HttpServletRequset request, HttpServletResponse res)
		throws IOException, ServletException {
		System.out.println ("Hello Servlet!!");

		OutputStream os = res.getOutputStream();
		PrintStream out = new PrintStream(os, true);
		out.println("<h1>Hello~~ Servlet~~~</h1>");
	}
}