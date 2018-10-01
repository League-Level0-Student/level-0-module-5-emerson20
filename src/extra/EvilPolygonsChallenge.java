package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot Steve = new Robot();
		//2. Set the speed to 100
Steve.setSpeed(200);
		int colorChoice=JOptionPane.showOptionDialog(null, "Pick a color.", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"turquoise","green","yellow"}, 0);
		System.out.println(colorChoice);
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		Steve.penDown();
		if(colorChoice == 0) { 
		Steve.setPenColor(26, 239, 232);
		}else if(colorChoice == 1) {
			Steve.setPenColor(37, 239, 26);
		}else if(colorChoice == 2) {
			Steve.setPenColor(242, 255, 0);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String bee = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		//5. Use the robot to draw the number of polygons the user requested.
		int num = Integer. parseInt(bee);
		for (int i = 0; i < num; i++) {
Steve.move(200);		
Steve.turn(90);
Steve.move(100);
Steve.turn(116);
Steve.move(270);
		}
	
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

