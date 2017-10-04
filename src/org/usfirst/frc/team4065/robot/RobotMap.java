package org.usfirst.frc.team4065.robot;

import java.util.ArrayList;

import com.ctre.MotorControl.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.XboxController;

public class RobotMap {
	
	public static RobotDrive robot; // TODO: Read more about the RobotDriver and other options
	public static Compressor compressor = new Compressor(); // TODO: Find out how to turn this on
	public static XboxController controller = new XboxController(1); // TODO: http://www.instructables.com/id/Programming-an-FRC-Robot/ Speed with Z?
	
	public static ArrayList<CANTalon> motors = new ArrayList<CANTalon>();
	private static void setupTalons() {
		System.out.println("Setting up motors/CANTalons...");
		// These are the two motors for the wheels
		motors.add(new CANTalon(1));
		motors.add(new CANTalon(2));
		
		// Lift Motor
		motors.add(new CANTalon(3));
		
		// TODO: Add the rest of the CANTalons
	}

	public static void init() {
		setupTalons();
		robot = new RobotDrive(motors.get(1), motors.get(2));
	}
}
