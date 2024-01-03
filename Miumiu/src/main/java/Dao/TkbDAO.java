package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.GiangVien;
import Model.Mon;
import Model.Phong;
import Model.TKB;

public class TkbDAO implements DaoInterface<TKB>{
	public static TkbDAO GetInstance() {
		return new TkbDAO();
	}
	
	@Override
	public int Insert(TKB t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(TKB t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(TKB t) {
		int rs = 0;
		Connection conn = null;
		
			try {
				if(conn == null) {
				conn = JDBCUtil.getConnection();
				String sql = "Update TKB set IDMon=?, IDGiangVien=?, IDLop=?, IDPhong=?, TietBD=?, TietKT=? where Thu=? ";
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, t.getMon().getIdMonHoc());
				pstm.setString(2, t.getGiangvien().getIdGiangVien());
				pstm.setString(3, t.getIdlop());
				pstm.setString(4, t.getPhong().getIdPhong());
				pstm.setString(5, t.getTietBD());
				pstm.setString(6, t.getTietKT());
				pstm.setString(7, t.getThu());
				
				rs = pstm.executeUpdate();
}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return rs;
	}

	@Override
	public ArrayList<TKB> SelectAll() {
		ArrayList<TKB> EQ = new ArrayList<TKB>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM TKB";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String thu = rs.getString("Thu");
				String idgv = rs.getString("IDGiangVien");
				String idmon = rs.getString("IDMon");
				String idphong = rs.getString("IDPhong");
				String idlop = rs.getString("IDLop");
				String tietbd = rs.getString("TietBD");
				String tietkt = rs.getString("TietKT");
				GiangVien gv = new GiangVien();
				Mon mon = new Mon();
				Phong phong = new Phong();
				phong = PhongDAO.GetInstance().SelectByID(idphong);
				gv = GiangVienDAO.GetInstance().SelectByID(idgv);
				mon = MonhocDAO.GetInstance().SelectByID(idmon);
				
				TKB tkb = new TKB(gv, mon, thu, idlop, phong, tietbd, tietkt);
				EQ.add(tkb);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public TKB SelectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<TKB> SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
