package org.usfirst.frc.team4065.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4065.robot.RobotMap;

public class Robot extends IterativeRobot {

	public void robotInit() {
		// TODO: Figure out which camera is forward and backwards
		CameraServer.getInstance().startAutomaticCapture(0);
		CameraServer.getInstance().startAutomaticCapture(1);
		
		RobotMap.init();
	}
	
	public void teleopPeriodic() {
		while(isOperatorControl() && isEnabled()) {
			RobotMap.robot.arcadeDrive(RobotMap.controller.getRawAxis(1), RobotMap.controller.getRawAxis(2));
			Timer.delay(0.01);
		}
	}
}
