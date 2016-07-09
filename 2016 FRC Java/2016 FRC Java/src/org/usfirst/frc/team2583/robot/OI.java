package org.usfirst.frc.team2583.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	public static Joystick joy = new Joystick(1);
	public static final Button 
		BUTTON_A = new JoystickButton(joy, 1),
		BUTTON_B = new JoystickButton(joy, 2),
		BUTTON_X = new JoystickButton(joy, 3),
		BUTTON_Y = new JoystickButton(joy, 4),
		BUTTON_L_BUMPER = new JoystickButton(joy, 5),
		BUTTON_R_BUMPER = new JoystickButton(joy, 6),
		BUTTON_BACK = new JoystickButton(joy, 7),
		BUTTON_START = new JoystickButton(joy, 8),
		BUTTON_L_JOY = new JoystickButton(joy, 9),
		BUTTON_R_JOY = new JoystickButton(joy, 10);
	public static final int
		LEFT_X = 1,
		LEFT_Y = 2,
		TRIGGERS = 3,
		RIGHT_X = 4,
		RIGHT_Y = 5,
		D_PAD = 6;
	
	public OI(){
		
	}
	
	public double getRightY(){
		return joy.getRawAxis(RIGHT_Y);
	}
	
	public double getLeftY(){
		return joy.getRawAxis(LEFT_Y);
	}
	
	public double getRightX(){
		return joy.getRawAxis(RIGHT_X);
	}
	
	public double getLeftX(){
		return joy.getRawAxis(LEFT_X);
	}
}

