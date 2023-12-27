package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Database.JDBCUtil;
import Model.Tiet;

public class TietDAO implements DaoInterface<Tiet>{

	@Override
	public int Insert(Tiet t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(Tiet t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(Tiet t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Tiet> SelectAll() {
		ArrayList<Tiet> EQ = new ArrayList<Tiet>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM TietTrongNgay";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("TietBD");
				
				Tiet tiet = new Tiet(id);
				EQ.add(tiet);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public Tiet SelectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Tiet> SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}
