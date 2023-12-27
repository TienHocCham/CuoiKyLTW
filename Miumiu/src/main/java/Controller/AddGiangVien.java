package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Dao.GiangVienDAO;

/**
 * Servlet implementation class AddGiangVien
 */
public class AddGiangVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGiangVien() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GiangVienDAO dao = new GiangVienDAO();
		String idgv = request.getParameter("IDGVADD");
		String idkhoa =  request.getParameter("IDKHOAADD");
		String ten =  request.getParameter("TENADD");
		String idmon =  request.getParameter("IDMONADD");
		
		try {
		    dao.Insert();
		} catch (ClassNotFoundException e) {
		    e.printStackTrace();
		}
		response.sendRedirect("Medicine");

	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}