package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Thu;

public class ThuDAO implements DaoInterface<Thu>{

	@Override
	public int Insert(Thu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(Thu t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(Thu t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Thu> SelectAll() {
		ArrayList<Thu> EQ = new ArrayList<Thu>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM Thu";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("Thu");
				int khoaql = rs.getInt("Tuan");
				
				Thu thu = new Thu(id, khoaql);
				EQ.add(thu);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public Thu SelectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Thu> SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}
