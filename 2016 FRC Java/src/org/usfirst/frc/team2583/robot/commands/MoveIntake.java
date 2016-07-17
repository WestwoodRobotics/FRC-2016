package org.usfirst.frc.team2583.robot.commands;

import org.usfirst.frc.team2583.robot.RMap;
import org.usfirst.frc.team2583.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveIntake extends Command {
	
	private final Intake intake;
	final RMap.AdjustMode mode;
	
    public MoveIntake(RMap.AdjustMode mode) {
    	intake = Intake.getInstance();
    	requires(intake);
        this.mode = mode;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	switch(mode){
    	case Up:
    		intake.moveUp();
    		break;
    	case Down:
    		intake.moveDown();
    		break;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	intake.stopAdjustment();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
