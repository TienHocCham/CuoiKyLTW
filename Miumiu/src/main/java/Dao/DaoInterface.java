package Dao;

import java.util.ArrayList;

import Model.GiangVien;


public interface DaoInterface<T> {
	public int Insert(T t);
	public boolean Delete(T t);
	public int Update(T t);
	public ArrayList<T> SelectAll();
	public T SelectByID(String id);
	public ArrayList<T> SelectCondition(String condition);
	boolean Delete(String t);
	
	
}
