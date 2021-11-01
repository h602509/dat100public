package no.hvl.dat100.oppgave2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgave2/";

	static public void main(String[] args) throws FileNotFoundException {

		String filnavn = null;
		int i = 0;
		int antallInput = 3;
		boolean lestFraFil = false;

		while (i < antallInput) {

			try {

				filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

				File file = new File(MAPPE_STR + filnavn);

				BufferedReader reader = new BufferedReader(new FileReader(file));

				int linenumber = 1;

				// les innhold i filen linje for linje
				String line;

				while (reader.ready()) {
					line = reader.readLine();
					System.out.println(linenumber + " " + line);
					linenumber++;
					lestFraFil = true;
				}

				reader.close();
			} catch (IOException e) {
				
				if (filnavn != null) {
					JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
				}
			}
			
			if (lestFraFil) {

				i = antallInput;
			}
			
			i++;
		}
	}
}
