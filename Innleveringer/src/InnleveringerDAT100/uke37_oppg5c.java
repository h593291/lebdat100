package InnleveringerDAT100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class uke37_oppg5c {
	public static void main(String[] args) {
				
		for (int antStudenter=1; antStudenter<=10; ) {
		
			String tallTxt = showInputDialog("Oppgi poengsum: ");
			int poeng = parseInt(tallTxt);
			
			if ((poeng>=0)&&(poeng<=39)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter F";
				showMessageDialog(null, utTxt);
				antStudenter ++;
			}
		if ((poeng>=40)&&(poeng<=49)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter E";
				showMessageDialog(null, utTxt);
				antStudenter ++;
		}
		if ((poeng>=50)&&(poeng<=59)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter D";
				showMessageDialog(null, utTxt);
				antStudenter ++;
		}
		if ((poeng>=60)&&(poeng<=79)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter C";
				showMessageDialog(null, utTxt);
				antStudenter ++;
		}
		if ((poeng>=80)&&(poeng<=89)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter B";
				showMessageDialog(null, utTxt);
				antStudenter ++;
		}
		if ((poeng>=90)&&(poeng<=100)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nDu har oppnådd karakter A";
				showMessageDialog(null, utTxt);
				antStudenter ++;
		}
		if ((poeng>100)||(poeng<0)){
				String utTxt = "Student nummer " + antStudenter + " av 10" + "\nUgyldig poengsum. Vennligst prøv igjen.";
				showMessageDialog(null, utTxt);
		}
}
		String utTxt = "Fullført";
		showMessageDialog(null, utTxt);
}
}