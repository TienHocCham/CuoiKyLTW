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

public class MonhocDAO implements DaoInterface<Mon> {

	public static MonhocDAO GetInstance() {
		return new MonhocDAO();
	}

	@Override
	public int Insert(Mon t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(Mon t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(Mon t) {
		int rs = 0;
		Connection conn = null;
		
			try {
				if(conn == null) {
				conn = JDBCUtil.getConnection();
				String sql = "Update Mon_Hoc set TenMon=?, IDKhoahoc=?, TinChi=?, IDKhoaql=? where IDMon=? ";
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, t.getTenMonHoc());
				pstm.setString(2, t.getIdKhoaHoc());
				pstm.setInt(3, t.getTinchi());
				pstm.setString(4, t.getIdKhoaQL());
				pstm.setString(5, t.getIdMonHoc());
				rs = pstm.executeUpdate();
				System.out.print(sql);
}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return rs;
	}

	@Override
	public ArrayList<Mon> SelectAll() {
		ArrayList<Mon> EQ = new ArrayList<Mon>();
		try {

			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM MON_HOC";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String id = rs.getString("IDMon");
				String khoaql = rs.getString("IDKhoaql");
				String ten = rs.getString("TenMon");
				int s = rs.getInt("TinChi");
				String khoahoc = rs.getString("IDKhoahoc");

				GiangVien gv = new GiangVien();
				gv = GiangVienDAO.GetInstance().SelectByIDM(id);
				Mon mon = new Mon(id, khoaql, ten, s, gv, khoahoc);
				EQ.add(mon);
			}

			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return EQ;
	}

	@Override
	public Mon SelectByID(String id) {
		try {

			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Mon_Hoc WHERE IDMon = '" + id + "'";
			Statement pst = con.createStatement();
			System.out.print(sql);
			ResultSet rs = pst.executeQuery(sql);
			while (rs.next()) {
				String id1 = rs.getString("IDMon");
				String khoaql = rs.getString("IDKhoaql");
				String ten = rs.getString("TenMon");
				int s = rs.getInt("TinChi");
				String khoahoc = rs.getString("IDKhoahoc");
				GiangVien gv = new GiangVien();
				gv = GiangVienDAO.GetInstance().SelectByIDM(id1);
				Mon mon = new Mon(id, khoaql, ten, s, gv, khoahoc);
				return mon;
			}
			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Mon> SelectCondition(String condition) {
		ArrayList<Mon> EQ = new ArrayList<Mon>();
		try {

			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "select * from MON_HOC where IDMon in (select IDMon from GIANG_VIEN where IDGiangvien ='"
					+ condition + "'";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String id = rs.getString("IDMon");
				String khoaql = rs.getString("IDKhoaql");
				String ten = rs.getString("TenMon");
				int s = rs.getInt("TinChi");
				String khoahoc = rs.getString("IDKhoahoc");

				GiangVien gv = new GiangVien();
				gv = GiangVienDAO.GetInstance().SelectByIDM(id);
				Mon mon = new Mon(id, khoaql, ten, s, gv, khoahoc);
				EQ.add(mon);
			}

			JDBCUtil.closeConnection(con);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return EQ;
	}

	@Override
	public boolean Delete(String t) {
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql="DELETE FROM Mon_Hoc WHERE IDMon = ?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, t);
			pst.executeUpdate();
			JDBCUtil.closeConnection(conn);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
