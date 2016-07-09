package org.usfirst.frc.team2583.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static final int
		// The asteroids comprise the drivebase (probably not correct right now)
		asteroid1 = 0,	// Front left
		asteroid2 = 1,	// Rear left
		asteroid3 = 2,	// Front right
		asteroid4 = 3,	// Rear right
		
		
		// The motors for the shooting mechanism (wheels)
		shooter1 = 4,
		shooter2 = 5;
}
