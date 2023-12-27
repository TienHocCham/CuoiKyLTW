package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.LopHoc;
import Model.Phong;

public class LopDAO implements DaoInterface{

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
	public ArrayList<LopHoc>SelectAll() {
		ArrayList<LopHoc> EQ = new ArrayList<LopHoc>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM LOP_HOC";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDLop");
				String khoaql = rs.getString("IDKhoaQL");
				String ten = rs.getString("TenLop");
				int t = rs.getInt("SiSo");
				
				LopHoc lop = new LopHoc(id, khoaql, ten, t);
				EQ.add(lop);
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
	public ArrayList SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}
