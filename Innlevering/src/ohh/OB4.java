package ohh;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class OB4 {

	public static void main(String[] args) {
		String bruttoTxt = showInputDialog("Skriv inn brutto");
		
		int brutto = parseInt(bruttoTxt);
		double prosent = 0.0;
		
		if (brutto >= 190350 && brutto < 267900) {
			prosent = 1.7;
		} else if (brutto >= 267900 && brutto < 643800) {
			prosent = 4.0;
		}else if (brutto >= 643800 && brutto < 969200) {
			prosent = 13.4;
		}else if (brutto >= 969200 && brutto < 2000000) {
				prosent = 16.4;
		}else if (brutto >= 2000000) {
			prosent = 17.4;
		}
		
			
	double skatt = ((brutto/100) * prosent);
	double utbetalt = (brutto - skatt);
	
	showMessageDialog(null, "Du betaler " +skatt + "kr i skatt, og vil få utebetalt " +utbetalt + "kr");
	
			

	}

}
