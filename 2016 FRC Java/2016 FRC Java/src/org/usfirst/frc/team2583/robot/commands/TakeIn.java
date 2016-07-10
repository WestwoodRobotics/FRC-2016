package org.usfirst.frc.team2583.robot.commands;

import org.usfirst.frc.team2583.robot.RMap;
import org.usfirst.frc.team2583.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TakeIn extends Command {

	final RMap.IntakeMode mode;
	
	public TakeIn(RMap.IntakeMode mode){
		requires(Robot.intake);
		this.mode = mode;
	}
	
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch(mode){
        case In:
        	Robot.intake.startIn();
        	break;
        case Out:
        	Robot.intake.startOut();
        	break;
        }
    }
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
