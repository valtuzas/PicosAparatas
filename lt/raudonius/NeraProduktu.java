package lt.raudonius;

public class NeraProduktu extends Exception {
	Receptas receptas;
	int dydis;
	public NeraProduktu(Receptas receptas, int dydis) {
		super();
		this.receptas = receptas;
		this.dydis = dydis;
	}

}
