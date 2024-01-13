// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {
  CANSparkMax Left_Leader = new CANSparkMax(0, MotorType.kBrushless);
  CANSparkMax Left_Follower = new CANSparkMax(1, MotorType.kBrushless);
  CANSparkMax Right_Leader = new CANSparkMax(2, MotorType.kBrushless);
  CANSparkMax Right_Follower = new CANSparkMax(3, MotorType.kBrushless);
  DifferentialDrive drive = new DifferentialDrive(Left_Leader, Right_Leader);
  Joystick stick = new Joystick(1);
  @Override
  public void robotInit() {
   
  }

  @Override
  public void robotPeriodic() {
    Left_Follower.follow(Left_Leader);
    Right_Follower.follow(Right_Leader);
  }


  @Override
  public void autonomousInit() {
   
  }

  /** This function is called periodically during autonomous. */
  @Override
  public void autonomousPeriodic() {
    
  }

  /** This function is called once when teleop is enabled. */
  @Override
  public void teleopInit() {}

  /** This function is called periodically during operator control. */
  @Override
  public void teleopPeriodic() {
    drive.arcadeDrive(-stick.getY(), -stick.getX());
  }

  /** This function is called once when the robot is disabled. */
  @Override
  public void disabledInit() {}

  /** This function is called periodically when disabled. */
  @Override
  public void disabledPeriodic() {}

  /** This function is called once when test mode is enabled. */
  @Override
  public void testInit() {}

  /** This function is called periodically during test mode. */
  @Override
  public void testPeriodic() {}

  /** This function is called once when the robot is first started up. */
  @Override
  public void simulationInit() {}

  /** This function is called periodically whilst in simulation. */
  @Override
  public void simulationPeriodic() {}
}
