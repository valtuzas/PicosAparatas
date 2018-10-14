package lt.raudonius;

public class Receptas {

	private String pavadinimas;
	private Produktai produktai;
	
	public Receptas(String pavadinimas, Produktai produktai) {
		super();
		this.pavadinimas = pavadinimas;
		this.produktai = produktai;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public Produktai getProduktai() {
		return produktai;
	}

	public void setProduktai(Produktai produktai) {
		this.produktai = produktai;
	}


	@Override
	public String toString() {
		return "[" + pavadinimas + "]";
	}
	

	
}
