package org.usfirst.frc.team2583.robot.subsystems;

import org.usfirst.frc.team2583.robot.RMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
    
	private static Intake instance;
	public static Intake getInstance(){
		if(instance == null){
			instance = new Intake();
		}
		return instance;
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Talon intaker = new Talon(RMap.intaker);
	Talon adjuster1 = new Talon(RMap.intake1);
	Talon adjuster2 = new Talon(RMap.intake2);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    /**
     * Stops the intaker from taking in any balls
     */
    public void stop(){
    	intaker.set(0);
    }
    
    /**
     * Makes the intaker start taking in balls
     */
    public void startIn(){
    	intaker.set(1);
    }
    
    /**
     * Makes the intaker eject the balls
     */
    public void startOut(){
    	intaker.set(-1);
    }
    
    /**
     * Move the intake up
     */
    public void moveUp(){
    	adjuster1.set(1);
    	adjuster2.set(1);
    }
    
    /**
     * Move the intake down
     */
    public void moveDown(){
    	adjuster1.set(-1);
    	adjuster2.set(-1);
    }
    
    /**
     * Stop the movement of the adjuster
     */
    public void stopAdjustment(){
    	adjuster1.set(0);
    	adjuster2.set(0);
    }
}

