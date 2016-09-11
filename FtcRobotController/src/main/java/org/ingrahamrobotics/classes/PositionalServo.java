package org.ingrahamrobotics.classes;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * Created by Ariel R-A on 9/10/2016.
 * Depending on this year's tele-op, this class might not be useful.
 */
public class PositionalServo extends Servo {

    private Dictionary<String, Double> myPositions;

    public PositionalServo(ServoController controller, int portNumber, Dictionary<String, Double> positions) {
        super(controller, portNumber);
        if(!isValidParam(positions)) {
            throw new IllegalArgumentException();
        }
        myPositions = positions;
    }

    private boolean isValidParam(Dictionary<String, Double> positions) {
        Enumeration<Double> values = positions.elements();
        while(values.hasMoreElements()) {
            double value = values.nextElement().doubleValue();
            if(!(value >= 0.0 && value <= 1.0)) {
                return false;
            }
        }

        return true;
    }

    private void setPosition(String position) {
        double value = myPositions.get(position).doubleValue();
        this.setPosition(value);
    }
}
