package org.usfirst.frc.team2583.robot;

import org.usfirst.frc.team2583.robot.commands.LoadNShoot;
import org.usfirst.frc.team2583.robot.commands.MoveIntake;
import org.usfirst.frc.team2583.robot.commands.TakeIn;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	private static OI instance;
	public static OI getInstance(){
		if(instance == null){
			instance = new OI();
		}
		return instance;
	}
	
	public final XControl XController1;
	
	public OI(){
		XController1 = new XControl(0);
		
		XController1.getButton(XControl.BUTTON_B).whileHeld(new TakeIn(RMap.IntakeMode.Out));
		XController1.getButton(XControl.BUTTON_A).whileHeld(new TakeIn(RMap.IntakeMode.In));
		XController1.getButton(XControl.BUTTON_Y).whileHeld(new MoveIntake(RMap.AdjustMode.Up));
		XController1.getButton(XControl.BUTTON_X).whileHeld(new MoveIntake(RMap.AdjustMode.Down));
		XController1.getButton(XControl.BUTTON_START).whenPressed(new LoadNShoot());
	}
}