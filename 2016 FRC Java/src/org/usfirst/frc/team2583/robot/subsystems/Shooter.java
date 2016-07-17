package org.usfirst.frc.team2583.robot.subsystems;

import org.usfirst.frc.team2583.robot.RMap;
import org.usfirst.frc.team2583.robot.commands.MoveShooter;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {
    
	private static Shooter instance;
	public static Shooter getInstance(){
		if(instance == null){
			instance = new Shooter();
		}
		return instance;
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	// The motors controlling the wheels on the shooter
	Talon
		shooter1 = new Talon(RMap.shooter1),
		shooter2 = new Talon(RMap.shooter2);
	
	// The motors controlling the movement of the shooter
	Talon
		adjuster1 = new Talon(RMap.shooterAdj1),
		adjuster2 = new Talon(RMap.shooterAdj2);
	
    public void initDefaultCommand() {
        setDefaultCommand(new MoveShooter());
    }
    
    public void spinWheels(){
    	shooter1.set(1);
    	shooter2.set(1);
    }
    
    public void stopWheels(){
    	shooter1.set(0);
    	shooter2.set(0);
    }
    
    public void setAdjSpeed(double speed){
    	adjuster1.set(speed);
    	adjuster2.set(speed);
    }
}

