package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Mon;

public class MonhocDAO implements DaoInterface<Mon>{

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
		// TODO Auto-generated method stub
		return 0;
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
			
			while(rs.next()) {
				String id = rs.getString("IDMonHoc");
				String khoaql = rs.getString("IDKhoaQL");
				String ten = rs.getString("TenMonHoc");
				int tinlt = rs.getInt("TinChi");
				
				
				Mon mon = new Mon(id, khoaql, ten, tinlt);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Mon> SelectCondition(String condition) {
		ArrayList<Mon> EQ = new ArrayList<Mon>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "select * from MON_HOC where IDMonHoc in (select IDMonHoc from GIANG_VIEN where IDGiangVien ='" + condition+"'";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDMonHoc");
				String khoaql = rs.getString("IDKhoaQL");
				String ten = rs.getString("TenMonHoc");
				int s = rs.getInt("TinChi");
				
				Mon phong = new Mon(id, khoaql, ten, s);
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
