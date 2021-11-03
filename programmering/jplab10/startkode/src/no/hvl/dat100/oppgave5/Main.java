package no.hvl.dat100.oppgave5;

public class Main {

	public static void main(String[] args) {
	
		int antallTerningKast = 100;
		
		Terning[] t = Simulering.terningTabell(antallTerningKast);
		Utskrift.SkrivUtKastTabellStr(t);
		Utskrift.SkrivUtAntallUlikeOyneStr(t);
		Utskrift.SkrivUtGjennomsnittKast(t);
		Utskrift.SkrivUtForsteKastStr(t, 6);
		Utskrift.SkrivUtFlestAvStr(t);
		
	}

}
