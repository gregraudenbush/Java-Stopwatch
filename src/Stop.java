
import models.StopwatchBean;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.jmx.snmp.Timestamp;

/**
 * Servlet implementation class Stop
 */
@WebServlet("/Stop")
public class Stop extends HttpServlet {
	private static final long serialVersionUID = 1L;
    java.sql.Timestamp endtime;
    String elapsed;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Stop() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		request.setAttribute("endtime", endtime);
		StopwatchBean s = (StopwatchBean) session.getAttribute("s");
		s.stop();
		endtime = s.endtime;
		elapsed = s.toString();
		session.setAttribute("endtime", endtime);
		session.setAttribute("elapsed", elapsed);
		 response.sendRedirect("http://localhost:8080/Stopwatch/StopwatchServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
