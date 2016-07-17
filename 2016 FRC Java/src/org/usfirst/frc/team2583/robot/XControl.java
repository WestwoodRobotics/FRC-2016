package org.usfirst.frc.team2583.robot;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class XControl extends Joystick{

	private Map<Integer, JoystickButton> buttons = new HashMap<Integer, JoystickButton>();
	
	public static final int 
		BUTTON_A = 1,
		BUTTON_B = 2,
		BUTTON_X = 3,
		BUTTON_Y = 4,
		BUTTON_L_BUMPER = 5,
		BUTTON_R_BUMPER = 6,
		BUTTON_BACK = 7,
		BUTTON_START = 8,
		BUTTON_L_JOY = 9,
		BUTTON_R_JOY = 10;
	public static final int
		AXIS_LEFT_X = 1,
		AXIS_LEFT_Y = 2,
		AXIS_L_TRIGGER = 3,
		AXIS_R_TRIGGER = 4,
		AXIS_RIGHT_X = 5,
		AXIS_RIGHT_Y = 6;
		
	public XControl(int port) {
		super(port);
	}
	
	public JoystickButton getButton(int buttonNum){
		if(buttons.get(buttonNum) == null){
			buttons.put(buttonNum, new JoystickButton(this, buttonNum));
		}
		
		return buttons.get(buttonNum);
	}
	
	public boolean buttonPressed(int buttonNum){
		return getRawButton(buttonNum);
	}
	
	public double getRightY(){
		return getRawAxis(AXIS_RIGHT_Y);
	}
	
	public double getRightX(){
		return getRawAxis(AXIS_RIGHT_X);
	}
	
	public double getLeftY(){
		return getRawAxis(AXIS_LEFT_Y);
	}
	
	public double getLeftX(){
		return getRawAxis(AXIS_LEFT_X);
	}
	
	public double getRightTrigger(){
		return getRawAxis(AXIS_R_TRIGGER);
	}
	
	public double getLeftTrigger(){
		return getRawAxis(AXIS_L_TRIGGER);
	}
	
	public boolean getPOVUp(){
		return getPOV() == 0;
	}
	
	public boolean getPOVRight(){
		return getPOV() == 90;
	}
	
	public boolean getPOVDown(){
		return getPOV() == 180;
	}
	
	public boolean getPOVLeft(){
		return getPOV() == 270;
	}
}
