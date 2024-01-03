package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.GiangVienDAO;
import Dao.TkbDAO;
import Model.GiangVien;
import Model.Mon;
import Model.Phong;
import Model.TKB;

/**
 * Servlet implementation class UpdateTKB
 */
public class UpdateTKB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTKB() {
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
	    String id = request.getParameter("idtkb");
	    String tengv = request.getParameter("TenGV");
	    String khoa = request.getParameter("idMon");
	    String k = request.getParameter("idLop");
	    String kh = request.getParameter("idPhong");
	    String kho = request.getParameter("idbd");
	    String kha = request.getParameter("idkt");

	    TKB tkb = new TKB();
	    
	    // Initialize Mon, GiangVien, and Phong objects
	    Mon mon = new Mon();
	    mon.setIdMonHoc(khoa);
	    
	    GiangVien giangVien = new GiangVien();
	    giangVien.setIdGiangVien(tengv);
	    
	    Phong phong = new Phong();
	    phong.setIdPhong(kh);

	    // Set initialized objects into TKB
	    tkb.setMon(mon);
	    tkb.setThu(id);
	    tkb.setGiangvien(giangVien);
	    tkb.setIdlop(k);
	    tkb.setPhong(phong);
	    tkb.setTietBD(kho);
	    tkb.setTietKT(kha);

	    TkbDAO.GetInstance().Update(tkb);
	    response.sendRedirect("RGSchedule");
	}


}
