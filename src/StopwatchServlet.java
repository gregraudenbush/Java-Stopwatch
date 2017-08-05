
import models.*;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StopwatchServlet
 */
@WebServlet("/StopwatchServlet")
public class StopwatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ArrayList<Long>[] starts;
    Timestamp starttime;
    java.sql.Timestamp endtime;
    String elapsed;
    public StopwatchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		
		request.setAttribute("starttime", starttime);
		
		StopwatchBean s = new StopwatchBean();
		s.start();
		starttime = s.starttime;
		
		session.setAttribute("s", s);
		
		endtime = (Timestamp) session.getAttribute("endtime");
		elapsed = (String) session.getAttribute("elapsed");
		
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/Index.jsp");
        view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
