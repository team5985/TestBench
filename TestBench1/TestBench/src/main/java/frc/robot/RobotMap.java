package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;



public class RobotMap {

private static RobotMap m_instance;

    public static RobotMap getInstance() {
        if (m_instance == null) {
            m_instance = new RobotMap();
        }

    return m_instance;
}

    WPI_VictorSPX victor1 = new WPI_VictorSPX(5);
    WPI_VictorSPX victor2 = new WPI_VictorSPX(6);


    public WPI_VictorSPX getIndexerEsc() {
        return victor1;
    }

    public WPI_VictorSPX getIntakeEsc() {
        return victor2;
    }
}