package org.usfirst.frc.team2583.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class LoadNShoot extends CommandGroup {
    
    public  LoadNShoot() {
    	addParallel(new Shoot());
    	addParallel(new MoveBall());
    }
}
