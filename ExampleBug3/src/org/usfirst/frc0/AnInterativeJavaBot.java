/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc0;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class AnInterativeJavaBot extends IterativeRobot {

	Jaguar leftDrive = new Jaguar(1);
	Jaguar rightDrive = new Jaguar(2);
	RobotDrive drive = new RobotDrive(leftDrive, rightDrive);
	Joystick leftJoystick = new Joystick(0);
	Joystick rightJoystick = new Joystick(1);

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	public void robotInit() {

	}

	/**
	 * This function is called periodically during autonomous
	 */
	public void autonomousPeriodic() {

	}

	/**
	 * This function is called periodically during operator control
	 */
	public void teleopPeriodic() {
		drive.tankDrive(rightJoystick.getX(),-leftJoystick.getY());
	}

}
/*
 * the goal of this class is to use the two joysticks to drive the two wheels as
 * tankdrive
 */
