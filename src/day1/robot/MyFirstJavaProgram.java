package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot dude = new Robot("mini");
		dude.setSpeed(10);
		dude.setRandomPenColor();
		dude.penDown();
		dude.move(200);
		dude.turn(100);
		dude.move(200);
	    dude.turn(100);
		
		
	}
}
