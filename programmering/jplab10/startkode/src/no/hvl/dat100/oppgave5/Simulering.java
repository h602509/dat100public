package no.hvl.dat100.oppgave5;

public class Simulering {

	public static Terning[] terningTabell(int antallKast) {

		Terning[] t = new Terning[antallKast];

		for (int i = 0; i < antallKast; i++) {

			Terning terning = new Terning();
			terning.trill();

			t[i] = terning;

		}

		return t;

	}

	public static int[] antallUlikeOyne(Terning[] t) {

		int enere = 0;
		int toere = 0;
		int treere = 0;
		int firere = 0;
		int femere = 0;
		int seksere = 0;

		for (int i = 0; i < t.length; i++) {

			if (t[i].getOyne() == 1) {
				enere++;
			}
			if (t[i].getOyne() == 2) {
				toere++;
			}
			if (t[i].getOyne() == 3) {
				treere++;
			}
			if (t[i].getOyne() == 4) {
				firere++;
			}
			if (t[i].getOyne() == 5) {
				femere++;
			}
			if (t[i].getOyne() == 6) {
				seksere++;
			}

		}
		int[] antallUlikeOyne = { enere, toere, treere, firere, femere, seksere };
		return antallUlikeOyne;
	}
}
