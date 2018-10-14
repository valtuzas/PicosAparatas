package lt.raudonius;

public class Main {

	public static void main(String[] args) throws NeraProduktu {
		PicosAparatoServizas picerija = new PicosAparatoServizas();
		picerija.sukurkPicosAparata(new Produktai(10, 100, 100, 100, 100));
		picerija.sukurkPicosAparata(new Produktai(100, 100, 100, 100, 100));
		picerija.sukurkPicosAparata(new Produktai(100, 100, 100, 100, 100));
		picerija.sukurtiPicosRecepta("paprasta", new Produktai(2, 2, 2, 2, 2));
		picerija.sukurtiPicosRecepta("prasta", new Produktai(1, 1, 1, 1, 1));
		picerija.sukurtiPicosRecepta("ipatinga", new Produktai(2, 3, 1, 2, 4));
		picerija.vartotojoKoncole();

	}

}
