/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI { //The OI class contains everything related to interpreting user input
  Joystick leftJoystick = new Joystick(RobotMap.leftJoystickPort); //Declares a Joystick with the name of leftJoystick 
  Joystick rightJoystick = new Joystick(RobotMap.rightJoystickPort); //and assigns it a new Joystick Class

  public double getLeftSpeed() { //Function which returns the leftJoystick "Speed" (Y-Axis)
    return leftJoystick.getY();
  }

  public double getRightSpeed() { //Function which returns the rightJoystick "Speed" (Y-Axis)
    return rightJoystick.getY();
  }
}
