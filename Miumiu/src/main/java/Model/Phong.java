package Model;

public class Phong {
	private String idPhong;
	private String tenPhong;
	private int Succhua;
	public Phong(String idPhong, String tenPhong, int succhua) {
		super();
		this.idPhong = idPhong;
		this.tenPhong = tenPhong;
		Succhua = succhua;
	}
	public Phong() {
		super();
	}
	public String getIdPhong() {
		return idPhong;
	}
	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public int getSucchua() {
		return Succhua;
	}
	public void setSucchua(int succhua) {
		Succhua = succhua;
	}
	@Override
	public String toString() {
		return "Phong [idPhong=" + idPhong + ", tenPhong=" + tenPhong + ", Succhua=" + Succhua + "]";
	}

	
}
