package org.usfirst.frc.team4065.robot;

import java.util.ArrayList;

import com.ctre.MotorControl.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;

public class RobotMap {
	
	public static RobotDrive roybot; // TODO: Read more about the RobotDriver and other options
	public static Compressor compressor = new Compressor(); // TODO: Find out how to turn this on
	
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
		roybot = new RobotDrive(motors.get(1), motors.get(2));
		
	}
}
