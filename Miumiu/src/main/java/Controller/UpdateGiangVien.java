package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.GiangVienDAO;
import Model.GiangVien;

/**
 * Servlet implementation class UpdateGiangVien
 */
@WebServlet("/UpdateGiangVien")
public class UpdateGiangVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateGiangVien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		if(id != null) {
			GiangVien gv = new GiangVien();
			GiangVienDAO dao = new GiangVienDAO();
			gv = dao.SelectByID(id);
			System.out.println(gv.toString());
			request.setAttribute("data", gv);
			request.getRequestDispatcher("Update.jsp").forward(request, response);
		}
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String ten=request.getParameter("TenGV");
		String khoa =request.getParameter("idKhoaQL");
		GiangVien gv = new GiangVien();
		gv.setIdGiangVien(id);
        gv.setTenGV(ten);
        gv.setIdKhoaQL(khoa);
        System.out.println("id = " +id);
        GiangVienDAO.GetInstance().Update(gv);
		response.sendRedirect("GiangVienServlet");
	}

}
