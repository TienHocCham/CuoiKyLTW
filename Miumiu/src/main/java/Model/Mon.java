package Model;

public class Mon {
	private String idMonHoc;
	private String idKhoaQL;
	private String tenMonHoc;
	private int tinchi;
	private GiangVien gv;
	private String idKhoaHoc;
	public Mon(String idMonHoc, String idKhoaQL, String tenMonHoc, int tinchi, GiangVien gv, String idKhoaHoc) {
		super();
		this.idMonHoc = idMonHoc;
		this.idKhoaQL = idKhoaQL;
		this.tenMonHoc = tenMonHoc;
		this.tinchi = tinchi;
		this.gv = gv;
		this.idKhoaHoc = idKhoaHoc;
	}
	public Mon() {
		super();
	}
	public String getIdMonHoc() {
		return idMonHoc;
	}
	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}
	public String getIdKhoaQL() {
		return idKhoaQL;
	}
	public void setIdKhoaQL(String idKhoaQL) {
		this.idKhoaQL = idKhoaQL;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public int getTinchi() {
		return tinchi;
	}
	public void setTinchi(int tinchi) {
		this.tinchi = tinchi;
	}
	public GiangVien getGv() {
		return gv;
	}
	public void setGv(GiangVien gv) {
		this.gv = gv;
	}
	public String getIdKhoaHoc() {
		return idKhoaHoc;
	}
	public void setIdKhoaHoc(String idKhoaHoc) {
		this.idKhoaHoc = idKhoaHoc;
	}
	@Override
	public String toString() {
		return "Mon [idMonHoc=" + idMonHoc + ", idKhoaQL=" + idKhoaQL + ", tenMonHoc=" + tenMonHoc + ", tinchi="
				+ tinchi + ", gv=" + gv + ", idKhoaHoc=" + idKhoaHoc + "]";
	}
	
	
	
}
