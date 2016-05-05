package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot Robo=new Robot ("batman");
		
		// 5. Set your robot's pen to the down position
Robo.penDown();
	
		Robo.setSpeed(250);

		
for (int i = 0; i < 75; i++) {
	
			// 7. Change the pen color to random
Robo.setPenColor(Color.black);

	Robo.move(22*i);
		
	Robo.turn(360/7);
	
}
	}
}
