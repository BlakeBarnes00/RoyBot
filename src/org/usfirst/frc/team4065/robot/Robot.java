package org.usfirst.frc.team4065.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;

import org.usfirst.frc.team4065.robot.RobotMap;

public class Robot extends IterativeRobot {

	public void robotInit() {
		// TODO: Figure out which camera is forward and backwards
		CameraServer.getInstance().startAutomaticCapture(0);
		CameraServer.getInstance().startAutomaticCapture(1);
		
		RobotMap.init();
	}
	
	public void teleopPeriodic() {
		
	}
}
