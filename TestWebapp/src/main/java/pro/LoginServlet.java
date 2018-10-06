package pro;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response){
		
		try{
		if(request.getParameter("uname").equals("admin") && request.getParameter("psw").equals("pass")){
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("tryagain.jsp").forward(request, response);
		}
		}
		catch(IOException e){
			System.err.println(e);
		}
		catch(ServletException e){
			System.err.println(e);
		}
	}
}
