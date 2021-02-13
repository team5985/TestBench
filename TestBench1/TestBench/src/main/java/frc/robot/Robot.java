// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.CANifier.PWMChannel;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.Compressor;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.SparkMaxCheck;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */

public class Robot extends TimedRobot {

  //public static final int kPcmCanId = 61;

  Joystick stick = new Joystick(0);

  static CANSparkMax neo1 = new CANSparkMax(1, MotorType.kBrushless);
  static CANSparkMax neo2 = new CANSparkMax(2, MotorType.kBrushless);
  static Spark rightMotor1 = new Spark(0);
  static Spark rightMotor2 = new Spark(1);
  static Spark leftMotor1 = new Spark(2);
  static Spark leftMotor2 = new Spark(3);
  //TalonFX falcon1 = new TalonFX(3);
  //TalonFX falcon2 = new TalonFX(4);
  CANEncoder encoder1 = new CANEncoder(neo2);
  CANEncoder encoder2 = new CANEncoder(neo2);
  //Compressor compressor = new Compressor(kPcmCanId);
  PowerDistributionPanel pdp = new PowerDistributionPanel(61);
  //private static final String kDefaultAuto = "Default";
  //private static final String kCustomAuto = "My Auto";
  //private String m_autoSelected;
  //private final SendableChooser<String> m_chooser = new SendableChooser<>();

  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {

  }

  /**
   * 
   * \\
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before LiveWindow and
   * SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {}

  /**
   * This autonomous (along with the chooser code above) shows how to select between different
   * autonomous modes using the dashboard. The sendable chooser code works with the Java
   * SmartDashboard. If you prefer the LabVIEW Dashboard, remove all of the chooser code and
   * uncomment the getString line to get the auto name from the text box below the Gyro
   *
   * <p>You can add additional auto modes by adding additional comparisons to the switch structure
   * below with additional strings. If using the SendableChooser make sure to add them to the
   * chooser code above as well.
   */
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
    if(stick.getRawButton(1)) {
    leftMotor2.set(0.5);
    rightMotor2.set(-0.5);
    leftMotor1.set(0.5);
    rightMotor1.set(-0.5);
    }
    else if (stick.getRawButton((2))){
      leftMotor2.set(-0.5);
      rightMotor2.set(0.5);
      leftMotor1.set(-0.5);
      rightMotor1.set(0.5);
    }
    else{
    leftMotor2.set(0);
    leftMotor1.set(0);
    rightMotor1.set(0);
    rightMotor2.set(0);

    }
    SmartDashboard.putNumber("Current", pdp.getCurrent(0));
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
}
