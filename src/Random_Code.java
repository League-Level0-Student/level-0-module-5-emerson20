import java.util.Random;

import javax.swing.JOptionPane;

public class Random_Code {
public static void main(String[] args) {
	Random sophie = new Random();
	int biana = sophie.nextInt(51);
	int keefe = sophie.nextInt(172);
	int twin = sophie.nextInt(43)+60;
	int alden = sophie.nextInt(287)+60;
	int leto = sophie.nextInt(19);
	JOptionPane.showMessageDialog(null, ""+biana+", "+keefe+", "+twin+", "+alden+", "+leto+"."); 
}
}