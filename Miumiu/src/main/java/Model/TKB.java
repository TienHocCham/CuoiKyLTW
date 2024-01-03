package Model;

public class TKB {
	private GiangVien giangvien;
	private Mon mon;
	private String Thu;
	private String idlop;
	private Phong phong;
	private String tietBD;
	private String tietKT;
	
	@Override
	public String toString() {
		return "TKB [giangvien=" + giangvien + ", mon=" + mon + ", Thu=" + Thu + ", idlop=" + idlop + ", phong=" + phong
				+ ", tietBD=" + tietBD + ", tietKT=" + tietKT + "]";
	}

	public GiangVien getGiangvien() {
		return giangvien;
	}

	public void setGiangvien(GiangVien giangvien) {
		this.giangvien = giangvien;
	}

	public Mon getMon() {
		return mon;
	}

	public void setMon(Mon mon) {
		this.mon = mon;
	}

	public String getThu() {
		return Thu;
	}

	public void setThu(String thu) {
		Thu = thu;
	}

	public String getIdlop() {
		return idlop;
	}

	public void setIdlop(String idlop) {
		this.idlop = idlop;
	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public String getTietBD() {
		return tietBD;
	}

	public void setTietBD(String tietBD) {
		this.tietBD = tietBD;
	}

	public String getTietKT() {
		return tietKT;
	}

	public void setTietKT(String tietKT) {
		this.tietKT = tietKT;
	}

	public TKB(GiangVien giangvien, Mon mon, String thu, String idlop, Phong phong, String tietBD, String tietKT) {
		super();
		this.giangvien = giangvien;
		this.mon = mon;
		Thu = thu;
		this.idlop = idlop;
		this.phong = phong;
		this.tietBD = tietBD;
		this.tietKT = tietKT;
	}

	public TKB() {
		super();
	}
	
}
