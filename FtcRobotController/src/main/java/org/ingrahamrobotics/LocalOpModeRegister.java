package org.ingrahamrobotics;

import com.qualcomm.robotcore.eventloop.opmode.OpModeManager;

import org.ingrahamrobotics.test.ColorSensorTest;
import org.ingrahamrobotics.test.TankTest;

/**
 * Created by kotlarek on 2015-11-04.
 */
public class LocalOpModeRegister {

    public LocalOpModeRegister(OpModeManager manager) {
        manager.register("TankTest", TankTest.class);
        manager.register("ColorSensorTest", ColorSensorTest.class);
    }
}