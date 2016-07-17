package org.usfirst.frc.team2583.robot.subsystems;

import org.usfirst.frc.team2583.robot.RMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private static DriveBase instance;
	public static DriveBase getInstance(){
		if(instance == null){
			instance = new DriveBase();
		}
		return instance;
	}
	
	public static final RobotDrive drive = new RobotDrive(RMap.asteroid1, RMap.asteroid2, RMap.asteroid3, RMap.asteroid4);
	
    public void initDefaultCommand() {
        // To avoid setting this in autonomous, keep this blank
    	//setDefaultCommand(new JoystickDrive());
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed){
    	drive.tankDrive(leftSpeed, rightSpeed);
    }
    
    public void arcadeDrive(float speed, float turn){
    	drive.arcadeDrive(speed, turn);
    }
}

