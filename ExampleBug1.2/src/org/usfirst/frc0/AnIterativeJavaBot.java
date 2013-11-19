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
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class AnIterativeJavaBot extends IterativeRobot {
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	Joystick lJoystick = new Joystick(1);
	Joystick rJoystick = new Joystick(2);
	JoystickButton fire1 = new JoystickButton(lJoystick, 1);
	JoystickButton fire2 = new JoystickButton(lJoystick, 1);
	Jaguar jag = new Jaguar(1);

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
		if (fire1.get()) {
			jag.set(0.5);
		}
		else if (fire2.get()) {
			jag.set(-0.5);
		} else {
			jag.set(0.0);
		}
		
	}

}
/*
 * the goal of this class is to have two buttons
 * the right joystick trigger should spin it forwards
 * the left joystick trigger should spin it backwards 
 * */
 