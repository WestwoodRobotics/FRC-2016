package org.usfirst.frc.team2583.robot;

import org.usfirst.frc.team2583.robot.commands.LoadNShoot;
import org.usfirst.frc.team2583.robot.commands.MoveIntake;
import org.usfirst.frc.team2583.robot.commands.TakeIn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
	private static Joystick XController1 = new Joystick(1);
	
	@SuppressWarnings("unused")
	private static final Button 
		BUTTON_A = new JoystickButton(XController1, 1),
		BUTTON_B = new JoystickButton(XController1, 2),
		BUTTON_X = new JoystickButton(XController1, 3),
		BUTTON_Y = new JoystickButton(XController1, 4),
		BUTTON_L_BUMPER = new JoystickButton(XController1, 5),
		BUTTON_R_BUMPER = new JoystickButton(XController1, 6),
		BUTTON_BACK = new JoystickButton(XController1, 7),
		BUTTON_START = new JoystickButton(XController1, 8),
		BUTTON_L_JOY = new JoystickButton(XController1, 9),
		BUTTON_R_JOY = new JoystickButton(XController1, 10);
	@SuppressWarnings("unused")
	private static final int
		LEFT_X = 1,
		LEFT_Y = 2,
		TRIGGERS = 3,
		RIGHT_X = 4,
		RIGHT_Y = 5,
		D_PAD = 6;
	
	public OI(){
		BUTTON_B.whileHeld(new TakeIn(RMap.IntakeMode.Out));
		BUTTON_A.whileHeld(new TakeIn(RMap.IntakeMode.In));
		BUTTON_Y.whileHeld(new MoveIntake(RMap.AdjustMode.Up));
		BUTTON_X.whileHeld(new MoveIntake(RMap.AdjustMode.Down));
		BUTTON_START.whenPressed(new LoadNShoot());
	}
	
	public double getRightY(){
		return XController1.getRawAxis(RIGHT_Y);
	}
	
	public double getLeftY(){
		return XController1.getRawAxis(LEFT_Y);
	}
	
	public double getRightX(){
		return XController1.getRawAxis(RIGHT_X);
	}
	
	public double getLeftX(){
		return XController1.getRawAxis(LEFT_X);
	}
	
	public double getTriggers(){
		return XController1.getRawAxis(TRIGGERS);
	}
}

