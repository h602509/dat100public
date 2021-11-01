package no.hvl.dat100.oppgave2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LeseFraFil {

	static String MAPPE_STR = System.getProperty("user.dir") + "/src/no/hvl/dat100/oppgave2/";

	static public void main(String[] args) {

		int antallForsok = 0;

		try {
			BufferedReader reader = null;

			while (antallForsok < 3 && reader == null) {

				String filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);
				File file = new File(MAPPE_STR + filnavn);

				try {

					antallForsok++;
					reader = new BufferedReader(new FileReader(file));

				} catch (FileNotFoundException e) {

					JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());

				}
			}

			if (reader == null) {
				JOptionPane.showMessageDialog(null, "Du har brukt opp alle forsøkene dine.\n");
				return;

			}

			int linenumber = 1;

			// les innhold i filen linje for linje
			String line;

			while (reader.ready()) {
				line = reader.readLine();
				System.out.println(linenumber + " " + line);
				linenumber++;

			}

			reader.close();

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Dette ble krøll\n" + e.getMessage());

		}
	}
}
