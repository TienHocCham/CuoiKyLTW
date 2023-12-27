package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Dao.GiangVienDAO;
import Model.GiangVien;

/**
 * Servlet implementation class SearchGVControl
 */
@WebServlet("/SerchGVControl")
public class SearchGVControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGVControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name =request.getParameter("search_keyword");
		ArrayList<GiangVien> danhsach = GiangVienDAO.GetInstance().SelectCondition(" IDGiangVien = '"+ request.getParameter("search_keyword")+"'"); 

        request.setAttribute("ketqua", danhsach);
        request.getRequestDispatcher("Search.jsp").forward(request, response);
	}
}