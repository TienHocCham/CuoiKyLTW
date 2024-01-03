package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.GiangVien;
import Model.Phong;

public class PhongDAO implements DaoInterface<Phong>{
	public static PhongDAO GetInstance() {
		return new PhongDAO();
	}

	@Override
	public int Insert(Phong t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean Delete(Phong t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Update(Phong t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Phong> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phong SelectByID(String id) {
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Phong_Hoc WHERE IDPhong = '" + id+"'";
			Statement pst = con.createStatement();
			System.out.print(sql);
			ResultSet rs = pst.executeQuery(sql);
			while(rs.next()) {
				String id1 = rs.getString("IDPhong");
				String khoaql = rs.getString("TenPhong");
				int s = rs.getInt("SucChua");
				
				Phong phong = new Phong(id1, khoaql, s);
				return phong;
				}
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Phong> SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(String t) {
		// TODO Auto-generated method stub
		return false;
	}

}