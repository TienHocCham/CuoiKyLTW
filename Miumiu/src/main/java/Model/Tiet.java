package Model;

public class Tiet {
	private int tietBD;

	public Tiet(int tietBD) {
		super();
		this.tietBD = tietBD;
	}

	public int getTietBD() {
		return tietBD;
	}

	public void setTietBD(int tietBD) {
		this.tietBD = tietBD;
	}

	@Override
	public String toString() {
		return "Tiet [tietBD=" + tietBD + "]";
	}
	
}
