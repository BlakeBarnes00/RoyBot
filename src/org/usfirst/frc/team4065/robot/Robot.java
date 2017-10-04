package org.usfirst.frc.team4065.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

	public void robotInit() {
		// TODO: Figure out which camera is forward and backwards
		CameraServer.getInstance().startAutomaticCapture(0);
		CameraServer.getInstance().startAutomaticCapture(1);
		
	
	}

	public void telopInit() {
		
	}


}
