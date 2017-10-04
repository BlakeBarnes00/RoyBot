package org.usfirst.frc.team4065.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

import org.usfirst.frc.team4065.robot.RobotMap;

public class Robot extends IterativeRobot {

	RobotDrive roybot = RobotMap.robot;
	
	public void robotInit() {
		// TODO: Figure out which camera is forward and backwards
		CameraServer.getInstance().startAutomaticCapture(0);
		CameraServer.getInstance().startAutomaticCapture(1);
		
		RobotMap.init();
	}

	public void autonomousPeriodic() {
		while(isAutonomous() && isEnabled()) {
			roybot.arcadeDrive(-0.5, 0.5);
			
			//RobotMap.motors.get(1).set(1);
			//RobotMap.motors.get(2).set(-1);
		}
	}
	
	public void teleopPeriodic() {
		while(isOperatorControl() && isEnabled()) {
			roybot.arcadeDrive(RobotMap.controller.getRawAxis(1), RobotMap.controller.getRawAxis(2));
			Timer.delay(0.01);
		}
	}
}
