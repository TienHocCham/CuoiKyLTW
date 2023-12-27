package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import Dao.GiangVienDAO;
import Model.GiangVien;

/**
 * Servlet implementation class GiangVienServlet
 */
@WebServlet("/GiangVienServlet")
public class GiangVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GiangVienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<GiangVien> danhsach = GiangVienDAO.GetInstance().SelectAll();
		request.setAttribute("list", danhsach);
     	request.getRequestDispatcher("listGV.jsp").forward(request, response);
		
	}
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
