package kurly;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/shop")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int cnt=0;

	public void init(ServletConfig config) throws ServletException {		
		System.out.println("init 메서드 입니다." + cnt);
	}


	public void destroy() {
		cnt++;
		System.out.println("destroy 메서드 입니다." + cnt);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cnt++;
		System.out.println("doGet 메서드 입니다." + cnt);
	}


}
