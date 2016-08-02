import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Ch2Dice extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String d1 = Integer.toString((int) ((Math.random() * 6) + 1));
		String d2 = Integer.toString((int) ((Math.random() * 6) + 1));
		out.println("<html> <body>"+
		"<h1 align=center>HF's Chap 2 Dice Roller</h1>"+
		"<p>" + d1 + " and " + d2 + " were rolled!" + "</p>" +
		"</body> </html>");
	}
}