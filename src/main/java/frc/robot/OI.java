/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class OI { //The OI class contains everything related to interpreting user input
  private XboxController xboxController = new XboxController(RobotMap.xboxControllerPort); //Declare new Xbox Controller

  public double[] getSpeeds() {
    double[] speeds = new double[2];
    double x = xboxController.getX();
    double y = xboxController.getY();
    double v = (100-Math.abs(x)) * (y/100) + y;
    double w = (100-Math.abs(y)) * (x/100) + x;
    speeds[0] = (v-w)/2;
    speeds[1] = (v+w)/2;
    return speeds;
  }
}
