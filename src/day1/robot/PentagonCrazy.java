package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		
Robot Robo=new Robot();
Robo.setSpeed(500);
	
Robo.penDown();
		// 8. Make the robot go at maximum speed (10)

		// 9. Set the pen to a color that you like for the shape


int sides=5;

int angle=135;
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.
for (int i = 100; i < 200; i--) {
	
	Robo.move(200);
			

	Robo.turn(angle);
			// 11. Turn the robot one more degree
	Robo.turn(5);

	}}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes
	public static void main(String[] args){
		
		new PentagonCrazy().makePrettyThings();
		
	}
}
