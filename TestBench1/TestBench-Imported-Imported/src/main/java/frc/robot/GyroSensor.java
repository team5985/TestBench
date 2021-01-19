package frc.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;
import edu.wpi.first.wpilibj.interfaces.Gyro;

public class GyroSensor{
    
    private GyroBase gyro;

    private static GyroSensor m_instance;

    public static synchronized GyroSensor getInstance() {
        if (m_instance == null) {
            m_instance = new GyroSensor();
        }
        return m_instance;
    }

    private GyroSensor()
    {
        Port spiPort = SPI.Port.kOnboardCS0;
        gyro = new ADXRS450_Gyro(spiPort);
        gyro.calibrate();
    }

    public double getGyroDegrees(){
        double gyroAngle = gyro.getAngle();
        return gyroAngle;
    }
    
    public double getGyroRotationRate(){
        double rotationRate = gyro.getRate();
        return rotationRate;

    }

    public void gyroReset(){
        gyro.reset();
    }

    
    public void gyroCalibrate(){
        System.out.println("Cal start");
        gyro.calibrate();
        System.out.println("Cal end");
    }

    public void update(){
        // gyroDegrees = getGyroDegrees(getGyro());
        // gyroRotationRate = getGyroRotationRate(getGyro());



    }
    



}