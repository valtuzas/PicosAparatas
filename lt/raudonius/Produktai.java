package lt.raudonius;

public class Produktai {
	private int suris;
	private int padas;
	private int padazas;
	private int desra;
	private int pomidoras;
	
	public Produktai(int suris, int padas, int padazas, int desra, int pomidoras) {
		this.suris = suris;
		this.padas = padas;
		this.padazas = padazas;
		this.desra = desra;
		this.pomidoras = pomidoras;
	}
	
	protected void atimkProduktus(Receptas receptas, int dydis){
		this.desra -= receptas.getProduktai().getDesra() * dydis;
		this.padas -= receptas.getProduktai().getPadas() * dydis;
		this.padazas -= receptas.getProduktai().getPadazas() * dydis;
		this.pomidoras -= receptas.getProduktai().getPomidoras() * dydis;
		this.suris -= receptas.getProduktai().getSuris() * dydis;
	}
	
	protected boolean arUztenkaProduktu(Receptas receptas, int dydis) {
		if (this.desra >= receptas.getProduktai().getDesra() * dydis
				&& this.padas >= receptas.getProduktai().getPadas() * dydis
				&& this.padazas >= receptas.getProduktai().getPadazas() * dydis
				&& this.pomidoras >= receptas.getProduktai().getPomidoras() * dydis
				&& this.suris  >= receptas.getProduktai().getSuris() * dydis) {
			return true;
		}
		return false;
	}
	
	public int getSuris() {
		return suris;
	}
	public void setSuris(int suris) {
		this.suris = suris;
	}
	public int getPadas() {
		return padas;
	}
	public void setPadas(int padas) {
		this.padas = padas;
	}
	public int getPadazas() {
		return padazas;
	}
	public void setPadazas(int padazas) {
		this.padazas = padazas;
	}
	public int getDesra() {
		return desra;
	}
	public void setDesra(int desra) {
		this.desra = desra;
	}
	public int getPomidoras() {
		return pomidoras;
	}
	public void setPomidoras(int pomidoras) {
		this.pomidoras = pomidoras;
	}

}
