package frc.robot.motorchecking;

public class motorCheckConstants {

    //Global
    public static final int kControllerBusVoltageShutdown = 10;
    public static final int kControllerBusVoltageWarning = 12;
    public static final int kMotorTemperatureShutdown = 80;
    public static final int kMotorTemperatureWarning = 55;
    public static final int kPDPOutputCurrentShutdown = 1;
    public static final int kPDPOutputCurrentWarning = 2;
    public static final int kMotorOutputCurrentShutdown = 20;
    public static final int kMotorOutputCurrentWarning = 25;
    public static final int kEncoderVelocityShutdown = 5;
    public static final int kEncoderVelocityWarning = 15;
    public static final double kMinimumSpeedForCheck = 0.4;
    public static final int faultScanCountMinimum = 15;
}