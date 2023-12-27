package Model;

public class Mon {
	private String idMonHoc;
	private String idKhoaQL;
	private String tenMonHoc;
	private int tietBD;
	private int tinchi;
	public Mon(String idMonHoc, String idKhoaQL, String tenMonHoc, int tinchi) {
		super();
		this.idMonHoc = idMonHoc;
		this.idKhoaQL = idKhoaQL;
		this.tenMonHoc = tenMonHoc;
		this.tinchi = tinchi;
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
	@Override
	public String toString() {
		return "Mon [idMonHoc=" + idMonHoc + ", idKhoaQL=" + idKhoaQL + ", tenMonHoc=" + tenMonHoc + ", tinchi="
				+ tinchi + "]";
	}
	
	
	
}
