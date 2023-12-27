package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.GiangVien;
import Model.Phong;

public class PhongDAO implements DaoInterface{

	@Override
	public int Insert(Object t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(Object t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Phong>SelectAll() {
		ArrayList<Phong> EQ = new ArrayList<Phong>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM PHONG";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDPhong");
				String khoaql = rs.getString("IDLoaiPhong");
				String ten = rs.getString("IDTinhTrang");
				String t = rs.getString("IDKhu");
				int te = rs.getInt("SucChua");
				
				Phong phong = new Phong(id, khoaql, ten, t, te);
				EQ.add(phong);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public Object SelectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Phong> SelectCondition(String condition) {
		ArrayList<Phong> EQ = new ArrayList<Phong>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "select * from MON_HOC where IDMonHoc in (select IDMonHoc from GIANG_VIEN where IDGiangVien ='" + condition+"'";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDPhong");
				String khoaql = rs.getString("IDLoaiPhong");
				String ten = rs.getString("IDTinhTrang");
				String i = rs.getString("IDKhu");
				int s = rs.getInt("SucChua");
				
				Phong phong = new Phong(id, khoaql, ten, i, s);
				EQ.add(phong);
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
		// TODO Auto-generated method stub
		return false;
	}

}
