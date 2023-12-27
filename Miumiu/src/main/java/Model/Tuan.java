package Model;

import java.sql.Date;

public class Tuan {
	private int tuan;
	private Date ngay;
	public Tuan(int tuan, Date ngay) {
		super();
		this.tuan = tuan;
		this.ngay = ngay;
	}
	public int getTuan() {
		return tuan;
	}
	public void setTuan(int tuan) {
		this.tuan = tuan;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	@Override
	public String toString() {
		return "Tuan [tuan=" + tuan + ", ngay=" + ngay + "]";
	}
	
}
