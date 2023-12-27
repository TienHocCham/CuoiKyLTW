package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.Tuan;

public class TuanDAO implements DaoInterface<Tuan>{

	@Override
	public int Insert(Tuan t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(Tuan t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(Tuan t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Tuan> SelectAll() {
		ArrayList<Tuan> EQ = new ArrayList<Tuan>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM Tuan";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("Tuan");
				Date khoaql = rs.getDate("Ngay");
				
				Tuan tuan = new Tuan(id, khoaql);
				EQ.add(tuan);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public Tuan SelectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tuan> SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}
