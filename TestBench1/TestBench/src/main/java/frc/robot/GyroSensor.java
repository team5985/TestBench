package frc.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class GyroSensor{
    
    public static double gyroDegrees;
    public static double gyroRotationRate;

    public GyroBase getGyro() {
        GyroBase gyro;
        gyro = new ADXRS450_Gyro();
        return gyro;
    }


    public double getGyroDegrees(GyroBase gyro){
        double gyroAngle = gyro.getAngle();
        return gyroAngle;
    }
    
    public double getGyroRotationRate(GyroBase gyro){
        double rotationRate = gyro.getRate();
        return rotationRate;

    }

    public GyroBase gyroReset(GyroBase gyro){
        gyro.reset();
        return gyro;
    }

    public void update(){
        gyroDegrees = getGyroDegrees(getGyro());
        gyroRotationRate = getGyroRotationRate(getGyro());



    }


}