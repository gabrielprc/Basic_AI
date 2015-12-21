package servlets;
import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.VisitaBean;

@WebServlet("/visita")
public class VisitaServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6277461199469430015L;
	@EJB
	private VisitaBean visitaBean;
	
	
	public VisitaServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		visitaBean.add();
		req.setAttribute("visita", visitaBean.getLast().toString());
		req.getRequestDispatcher("/WEB-INF/Visitas.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
}
