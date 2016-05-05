package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot Exmachina = new Robot("batman");
		Exmachina.setSpeed(100);
		Exmachina.setRandomPenColor();
		Exmachina.penDown();
Exmachina.sparkle();
		Exmachina.move(140);
Exmachina.turn(-90);
Exmachina.move(140);
Exmachina.turn(-90);
Exmachina.move(140);
Exmachina.turn(-90);
Exmachina.move(140);
	for(int i=0; i<75; i++){
		
		Exmachina.turn(100);
		Exmachina.move(140);
	}
}
}