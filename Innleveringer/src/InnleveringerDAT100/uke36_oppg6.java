package InnleveringerDAT100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class uke36_oppg6 {
	public static void main(String[]args) {
		
		String tallTxt = showInputDialog("Oppgi et heltall n som er større enn 0: ");
		int n=parseInt(tallTxt);		
		int svar=1;
		int i;
		
		if (n>0) {
			for(i=1; i<=n; i++) {
				
				svar=svar*i;
			}
			String utTxt2 = n+"! = " + svar;
			showMessageDialog(null, utTxt2);
		}
		if (n<=0) {
			showMessageDialog(null, "Ugyldig verdi.");
		}
					
	}
}	