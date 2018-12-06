/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.commands.TankDrive;

public class DriveTrain extends Subsystem {

  Spark leftMotor = new Spark(RobotMap.leftMotorPort); //Declares a new Spark and assigns it a new Spark class
  Spark rightMotor = new Spark(RobotMap.rightMotorPort); //See above

  @Override
  public void initDefaultCommand() { //Sets the default command for this SubSystem
    setDefaultCommand(new TankDrive());
  }

  public DriveTrain(String name) { //Constructor
      super(name);
  }

  public void leftMotorDrive(double speed) { //Function to apply speed to motor
    motorDrive(leftMotor, speed);
  }

  public void rightMotorDrive(double speed){ //Same as above function
    motorDrive(rightMotor, speed);
  }

  public void motorDrive(Spark targetMotor, double speed) { //Generic Function to assign any Spark a speed
    targetMotor.setSpeed(speed);
  }

  public void stop(){ //Stops all motors, effectively stopping the robot
    leftMotor.setSpeed(0);
    rightMotor.setSpeed(0);
  }
}
