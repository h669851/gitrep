package ohh;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppg3 {

	public static void main(String[] args) {
			
		String nTxt = showInputDialog("Skriv inn eit heiltal");
		
		int n = parseInt(nTxt);
		
		int svar = 1;
		
		for (int i = 1; i <= n; i++) {
			svar = svar * i;
		}
		
	showMessageDialog(null, n + "! =" + svar);

	}

}
