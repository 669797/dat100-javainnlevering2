package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.print("]");
		System.out.println();

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabelltekst = " ";
		for (int i : tabell) {
			i = Integer.parseInt(tabelltekst);
		}
		return tabelltekst;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;

		for (int i = 1; i < tabell.length; i++) {
			sum = tabell[i] + tabell[i - 1];
		}

		int j = 1;
		while (j < tabell.length) {
			sum = tabell[j] + tabell[j - 1];
			j++;
		}
		for (int k : tabell) {
			sum = k + k - 1;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;

		for (int i : tabell) {
			if (i == tall) {
				finnes = true;
			}

		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int forstetall = -1;
		int i = 0;

		for (i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				forstetall = i;
			}
		}
		return forstetall;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nytabell = new int[tabell.length];
		int j = 0;

		for (int i = tabell.length - 1; i >= 0; i--) {
			nytabell[j] = tabell[i];
			j++;
		}

		return nytabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		int i = 0;

		while (sortert && i < tabell.length - 1) {
			if (tabell[i] >= tabell[i + 1]) {
				sortert = false;
			}
			i++;
		}

		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nytabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nytabell[i] = tabell1[i];
		}
		
		int i = 0;
		for (int j = tabell1.length; j < nytabell.length; j++) {

			nytabell[j] = tabell2[i];
			i++;
		}
		return nytabell;

	}
}
