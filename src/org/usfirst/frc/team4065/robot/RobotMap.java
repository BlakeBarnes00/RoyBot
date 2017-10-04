package org.usfirst.frc.team4065.robot;

import java.util.ArrayList;

import com.ctre.MotorControl.CANTalon;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.RobotDrive;


public class RobotMap {
	
	
	public static RobotDrive roybot;
	
	public static ArrayList<CANTalon> motors = new ArrayList<CANTalon>();
	public void setupTalons() {
		System.out.println("Setting up motors/CANTalons...");
		
		// These are the two motors for the wheels
		motors.add(new CANTalon(1));
		motors.add(new CANTalon(2));
		
		// Lift Motor
		motors.add(new CANTalon(3));
		
		// TODO: Add the rest of the CANTalons
	}

	public static Compressor compressor = new Compressor();
	
}
