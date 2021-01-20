package frc.robot;

import com.revrobotics.ControlType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

class PidController {

    double p;
    double i;
    double d;
    double iz;
    double ff;
    double max;
    double min;

    Joystick stick = new Joystick(0);

    private static PidController m_instance;

    public static PidController getInstance() {
        if (m_instance == null) {
            m_instance = new PidController();
        }

        return m_instance;
    }

    public void shooterPIDControl(double targetVelocity) {
        /*
        *Based of the spark max example
        */


        //Set motor PID constants
        Robot.getMotor1PIDController().setP(p);
        Robot.getMotor1PIDController().setI(i);
        Robot.getMotor1PIDController().setD(d);
        Robot.getMotor1PIDController().setIZone(iz);
        Robot.getMotor1PIDController().setFF(ff);
        Robot.getMotor1PIDController().setOutputRange(min, max);

        Robot.getMotor2PIDController().setP(p);
        Robot.getMotor2PIDController().setI(i);
        Robot.getMotor2PIDController().setD(d);
        Robot.getMotor2PIDController().setIZone(iz);
        Robot.getMotor2PIDController().setFF(ff);
        Robot.getMotor2PIDController().setOutputRange(min, max);
        
         p = SmartDashboard.getNumber("P Gain", 6e-5);
         i = SmartDashboard.getNumber("I Gain", 0);
         d = SmartDashboard.getNumber("D Gain", 0);
        iz = SmartDashboard.getNumber("I Zone", 0);
        ff = SmartDashboard.getNumber("Feed Forward", 1);
        max = SmartDashboard.getNumber("Max Output", 1);
        min = SmartDashboard.getNumber("Min Output", -1);
        
        Robot.getMotor1PIDController().setReference(targetVelocity, ControlType.kVelocity);
        Robot.getMotor2PIDController().setReference(-targetVelocity, ControlType.kVelocity);
        System.out.println(targetVelocity);
        
    }
}