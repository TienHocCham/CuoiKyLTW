package Model;

public class Thu {
	private int thu;
	private int tuan;
	public Thu(int thu, int tuan) {
		super();
		this.thu = thu;
		this.tuan = tuan;
	}
	public int getThu() {
		return thu;
	}
	public void setThu(int thu) {
		this.thu = thu;
	}
	public int getTuan() {
		return tuan;
	}
	public void setTuan(int tuan) {
		this.tuan = tuan;
	}
	@Override
	public String toString() {
		return "Thu [thu=" + thu + ", tuan=" + tuan + "]";
	}
	
	
	
}
