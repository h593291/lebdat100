package InnleveringerDAT100;

import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class uke36_oppg4 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi bruttoinntekt: ");
		double brutto = parseDouble(tallTxt);
		double trinn;
		if ((brutto>=0)&&(brutto<=180800)){
			trinn = (brutto*0);
			String utTxt = "Du tilhører trinn 1 med 0% trinnskatt" + "\nDin trinnskatt: " + trinn;
			showMessageDialog(null, utTxt);
		}
		if ((brutto>=180801)&&(brutto<=254500)){
			trinn = (brutto*0.019);
			String utTxt = "Du tilhører trinn 2 med 1,9% trinnskatt" + "\nDin trinnskatt: " + trinn;
			showMessageDialog(null, utTxt);
		}
		if ((brutto>=254501)&&(brutto<=639750)){
			trinn = (brutto*0.042);
			String utTxt = "Du tilhører trinn 3 med 4,2% trinnskatt" + "\nDin trinnkatt: " + trinn;
			showMessageDialog(null, utTxt);
		}
		if ((brutto>=639751)&&(brutto<=999550)){
			trinn = (brutto*0.132);
			String utTxt = "Du tilhører trinn 4 med 13,2% trinnskatt" + "\nDin trinnskatt: " + trinn;
			showMessageDialog(null, utTxt);
		}
		if (brutto>=999551){
			trinn = (brutto*0.162);
			String utTxt = "Du tilhører trinn 4 med 16,2% trinnskatt" + "\nDin trinnskatt: " + trinn;
			showMessageDialog(null, utTxt);
		}
}
}