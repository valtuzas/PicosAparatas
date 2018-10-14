package lt.raudonius;

public class Pica  {
	private Receptas receptas;
	private int dydis;
	
	public Pica(Receptas receptas, int dydis) {
		super();
		this.receptas = receptas;
		this.dydis = dydis;
	}
	
	private String koksDydis(int dydis) {
		if(dydis == 1) {
			return "maza";
		}
		if(dydis == 2) {
			return "vidutine";
		}
		if(dydis == 3) {
			return "didele";
		}
		return null;
	}

	@Override
	public String toString() {
		return "Pica [receptas=" + receptas + ", dydis=" + koksDydis(this.dydis) + "]";
	}
	

	
}

