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
import Dao.TkbDAO;
import Dao.TuanDAO;
import Model.GiangVien;
import Model.Mon;
import Model.Phong;
import Model.TKB;

/**
 * Servlet implementation class RGSchedule
 */
public class RGSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RGSchedule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TkbDAO dao_tkb = new TkbDAO();
		ArrayList<Phong> phongList = null;
		ArrayList<Mon> monList = null;
		ArrayList<GiangVien> gvList = null;
		ArrayList<TKB> tkbList = null;
		phongList = PhongDAO.GetInstance().SelectAll();
		monList = MonhocDAO.GetInstance().SelectAll();
		tkbList = TkbDAO.GetInstance().SelectAll();
		request.setAttribute("list_p", phongList);
		request.setAttribute("List_tkb", tkbList);
		request.setAttribute("list_m", monList);
		request.setAttribute("list_gv", gvList);
		request.getRequestDispatcher("tkb.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
