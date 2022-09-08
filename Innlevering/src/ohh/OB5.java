package ohh;

import static javax.swing.JOptionPane.*;

public class OB5 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			int poeng = Integer.parseInt(showInputDialog("Tast inn din poengsum"));
			char karakter = ' ';
		if(poeng >=90  && poeng <= 100) {
			karakter = 'A';
				showMessageDialog(null, "karakter=" +karakter);
			}
		else if(poeng >=80  && poeng < 90) {
			karakter = 'B';
			showMessageDialog(null, "karakter=" +karakter);
				} 
		else if(poeng >=60  && poeng < 80) {
			karakter = 'C';
			showMessageDialog(null, "karakter=" +karakter);
				}
		
		else if(poeng >=50  && poeng < 60) {
			karakter = 'D';
			showMessageDialog(null, "karakter=" +karakter);
				} 
		else if(poeng >=40  && poeng < 50) {
			karakter = 'E';
			showMessageDialog(null, "karakter=" +karakter);
				} 
		
		else if(poeng >=0  && poeng < 40) {
			karakter = 'F';
			showMessageDialog(null, "karakter=" +karakter);
				} 
		else if (poeng > 100) {
			showMessageDialog(null, "Ugyldig poengsum");
		}
		else if (poeng < 0) {
			showMessageDialog(null, "Ugyldig poengsum");
		}
		}

	}
}
