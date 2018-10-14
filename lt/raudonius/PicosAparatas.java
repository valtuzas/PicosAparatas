package lt.raudonius;

public class PicosAparatas {
	private Produktai produktai;
	private final int PANAUDOJIMU_MAX = 20;
	private int panaudojimai = 0;

	public PicosAparatas(Produktai produktai) {
		this.produktai = produktai;
	}

	public Pica gaminkPica(Receptas receptas, int dydis) throws NeraProduktu {
		if (panaudojimai < PANAUDOJIMU_MAX) {
			try {
				if (!produktai.arUztenkaProduktu(receptas, dydis)) {
					throw new NeraProduktu(receptas, dydis);
				} else {
					this.produktai.atimkProduktus(receptas, dydis);
					panaudojimai++;
					System.out.println(new Pica(receptas, dydis).toString() + " pagaminta");
					return new Pica(receptas, dydis);
				}
			} catch(NeraProduktu e) {
				System.out.println("nera produktu");
			}
			
			
		} else {
			System.out.println("isvalyk aparata");
		}
		return null;
	}

	

	protected void isvalykAparata() {
		this.panaudojimai = 0;
	}

}
