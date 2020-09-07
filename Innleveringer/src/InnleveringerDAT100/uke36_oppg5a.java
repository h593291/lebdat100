package InnleveringerDAT100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class uke37_oppg5a {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi poengsum: ");
		int poeng = parseInt(tallTxt);
		
		if ((poeng>=0)&&(poeng<=39)){
			String utTxt = "Du har oppnåd karakter F";
			showMessageDialog(null, utTxt);
		}
		if ((poeng>=40)&&(poeng<=49)){
			String utTxt = "Du har oppnåd karakter E";
			showMessageDialog(null, utTxt);
		}
		if ((poeng>=50)&&(poeng<=59)){
			String utTxt = "Du har oppnåd karakter D";
			showMessageDialog(null, utTxt);
		}
		if ((poeng>=60)&&(poeng<=79)){
			String utTxt = "Du har oppnåd karakter C";
			showMessageDialog(null, utTxt);
		}
		if ((poeng>=80)&&(poeng<=89)){
			String utTxt = "Du har oppnåd karakter B";
			showMessageDialog(null, utTxt);
		}
		if ((poeng>=90)&&(poeng<=100)){
			String utTxt = "Du har oppnåd karakter A";
			showMessageDialog(null, utTxt);
		}
		if ((poeng>100)||(poeng<0)){
			String utTxt = "Ugyldig poengsum";
			showMessageDialog(null, utTxt);
		}
}
}