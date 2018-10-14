package lt.raudonius;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PicosAparatoServizas {
	private Scanner scanner = new Scanner(System.in);
	private List<PicosAparatas> picuAparatai = new ArrayList<>();
	private List<Receptas> receptai = new ArrayList<>();

	public List<PicosAparatas> getPicuAparatai() {
		return picuAparatai;
	}

	public List<Receptas> getReceptai() {
		return receptai;
	}

	public PicosAparatoServizas() {

	}

	public void sukurkPicosAparata(Produktai produktai) {
		picuAparatai.add(new PicosAparatas(produktai));
	}

	public void pasalinkPicosAparata(int kokiAparataSalinti) {
		picuAparatai.remove(kokiAparataSalinti);
	}

	public void sukurtiPicosRecepta(String pavadinimas, Produktai produktai) {
		receptai.add(new Receptas(pavadinimas, produktai));
	}

	public void pasalintiRecepta(Receptas receptas) {
		for (int i = 0; i < this.receptai.size(); i++) {
			if (this.receptai.get(i).toString().equals(receptas.toString())) {
				this.receptai.remove(i);
				i--;
			}
		}
	}

	public void vartotojoKoncole() throws NeraProduktu {
		boolean dirbti = true;
		while (dirbti) {
			int aparatas = -1;
			int receptas = -1;
			int dydis = -1;
			while (aparatas < 0 || aparatas > getPicuAparatai().size()) {
				System.out.println("pasirinkite aparata nuo " + 1 + " iki: " + getPicuAparatai().size());
				aparatas = scanner.nextInt() - 1;
			}
			while (receptas < 0 || receptas > getReceptai().size()) {
				System.out.print("kokia pica norite:");
				for (int i = 0; i < getReceptai().size(); i++) {
					System.out.print(" " + (i + 1) + " " + getReceptai().get(i).toString());
				}
				System.out.println();
				receptas = scanner.nextInt() - 1;
			}
			while (dydis < 1 || dydis > 3) {
				System.out.println("pasirinkite kokio dydzio pica norite: 1: maza 2: vidutine 3: didele");
				dydis = scanner.nextInt();
				if (dydis >= 1 && dydis <= 3) {
					getPicuAparatai().get(aparatas).gaminkPica(getReceptai().get(receptas), dydis);
				}
			}
			int pasirinkimas = 0;
			while (pasirinkimas != 1 && pasirinkimas != 2) {
				System.out.println("ar gaminti dar viena pica?  1: Taip 2:baigti darba");
				pasirinkimas = scanner.nextInt();
				if (pasirinkimas == 2) {
					dirbti = false;
				}
			}
		}
	}

}
