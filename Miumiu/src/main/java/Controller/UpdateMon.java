package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.GiangVienDAO;
import Dao.MonhocDAO;
import Model.GiangVien;
import Model.Mon;

/**
 * Servlet implementation class UpdateMon
 */
public class UpdateMon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMon() {
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
		String id = request.getParameter("idMon");
		String ten=request.getParameter("TenMon");
		String khoa =request.getParameter("idKhoahoc");
		String tinchiStr = request.getParameter("TinChi");
		int tinchi = Integer.parseInt(tinchiStr);
		String khoaql = request.getParameter("idkhoaql");
		Mon mon = new Mon();
		mon.setIdMonHoc(id);
        mon.setTenMonHoc(ten);
        mon.setIdKhoaHoc(khoa);
        mon.setTinchi(tinchi);
        mon.setIdKhoaQL(khoaql);
        System.out.println("id = " +id);
        MonhocDAO.GetInstance().Update(mon);
		response.sendRedirect("QLMonSVL");
	}

}
