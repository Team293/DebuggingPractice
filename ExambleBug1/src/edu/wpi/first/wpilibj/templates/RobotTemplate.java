package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DriverStationLCD;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Jaguar;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	Encoder enc = new Encoder(1, 1);
	Jaguar jag = new Jaguar(1);
	DriverStationLCD LCD = DriverStationLCD.getInstance();

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
		jag.set(0.2);
		LCD.println(DriverStationLCD.Line.kUser2, 1,
				"encoder cout: " + enc.getRaw());
		LCD.updateLCD();
	}

}
/*
 * this class should set the jaguar to 20% speed and print out the encoder count
 */