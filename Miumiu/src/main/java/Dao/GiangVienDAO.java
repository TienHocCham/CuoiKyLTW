package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.GiangVien;

public class GiangVienDAO implements DaoInterface<GiangVien>{
	

	public static GiangVienDAO GetInstance() {
		return new GiangVienDAO();
	}

	@Override
	public int Insert(GiangVien t) {	
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO GiangVien(IDGiangvien, IDKhoaql, TenGiangvien)" + 
			"VALUES("+ t.getIdGiangVien()+", "+ t.getIdKhoaQL()+", "+ t.getTenGV()+", "+ ")";
			
			EU = st.executeUpdate(sql);
			
			System.out.print("Bạn Đã Thực Thi: "+ sql);
			System.out.print("Có "+ EU +" Dòng Bị Thay Đổi!");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EU;
	}

	@Override
	public boolean Delete(String t) {
		try {
			Connection conn = JDBCUtil.getConnection();
			String sql="DELETE FROM GIANG_VIEN WHERE IDGiangvien = ?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, t);
			pst.executeUpdate();
			JDBCUtil.closeConnection(conn);;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public int Update(GiangVien t) {
		int rs = 0;
		Connection conn = null;
		
			try {
				if(conn == null) {
				conn = JDBCUtil.getConnection();
				String sql = "Update GIANG_VIEN set TenGiangvien=?, IDKhoaql=? where IDGiangvien=? ";
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, t.getTenGV());
				pstm.setString(2, t.getIdKhoaQL());
				pstm.setString(3, t.getIdGiangVien());
				
				rs = pstm.executeUpdate();
}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return rs;
	}

	@Override
	public ArrayList<GiangVien> SelectAll() {
		ArrayList<GiangVien> EQ = new ArrayList<GiangVien>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM GIANG_VIEN";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDGiangvien");
				String khoaql = rs.getString("IDKhoaql");
				String ten = rs.getString("TenGiangvien");
				
				GiangVien Gvien = new GiangVien(id, khoaql, ten);
				EQ.add(Gvien);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	public GiangVien SelectByID(String id) {
		GiangVien EQ = null;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM GIANG_VIEN WHERE IDGiangvien = '" + id+"'";
			Statement pst = con.createStatement();
			System.out.print(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
					String ID = rs.getString("IDGiangvien");
					String khoaql = rs.getString("IDKhoaql");
					String ten = rs.getString("TenGiangvien");
					EQ = new GiangVien(ID, khoaql, ten);
					return EQ;
				}
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<GiangVien> SelectCondition(String condition) {
		ArrayList<GiangVien> EQ = new ArrayList<GiangVien>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM GIANG_VIEN WHERE" + condition;
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDGiangvien");
				String khoaql = rs.getString("IDKhoaql");
				String ten = rs.getString("TenGiangvien");
				
				GiangVien Gvien = new GiangVien(id, khoaql, ten);
				EQ.add(Gvien);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public boolean Delete(GiangVien t) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public GiangVien SelectByIDM(String id) {
		GiangVien EQ = null;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM GIANG_VIEN WHERE IDGiangvien in (select IDGiangVien from KhoaQL where IDMon = '" + id+"')";
			Statement pst = con.createStatement();
			System.out.print(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
					String ID = rs.getString("IDGiangvien");
					String khoaql = rs.getString("IDKhoaql");
					String ten = rs.getString("TenGiangvien");
					EQ = new GiangVien(ID, khoaql, ten);
					return EQ;
				}
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
