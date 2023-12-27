package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Dao.GiangVienDAO;
import Dao.LopDAO;
import Dao.MonhocDAO;
import Dao.PhongDAO;
import Dao.ThuDAO;
import Dao.TietDAO;
import Dao.TuanDAO;
import Model.GiangVien;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		GiangVienDAO dao = new GiangVienDAO();
		PhongDAO daop = new PhongDAO();
		MonhocDAO daom = new MonhocDAO();
		LopDAO daol = new LopDAO();
		ThuDAO daoth = new ThuDAO();
		TuanDAO daot = new TuanDAO();
		TietDAO daott = new TietDAO();
			request.setAttribute("List_TH", daoth.SelectAll());
			request.setAttribute("List_T", daot.SelectAll());
			request.setAttribute("List_GV", dao.SelectAll());
			request.setAttribute("List_P", daop.SelectAll());
			request.setAttribute("List_M", daom.SelectAll());
			request.setAttribute("List_L", daol.SelectAll());
			request.setAttribute("List_TT", daott.SelectAll());
			request.getRequestDispatcher("Fix.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
