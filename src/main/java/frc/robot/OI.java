package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.ArmDown;
import frc.robot.commands.ArmUp;
import frc.robot.commands.GoOut;
import frc.robot.commands.HangEx;
import frc.robot.commands.HangRet;
// import edu.wpi.first.wpilibj.buttons.Button;
// import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.TakeIn;
import edu.wpi.first.wpilibj2.command.button.*;

public class OI {

    Joystick logi = new Joystick(0);
    Joystick gamePad = new Joystick(1);

    // joystick solo control
    // private final Button btnOut = new JoystickButton(logi, 1);
    // private final Button btnIn = new JoystickButton(logi, 2);

    // private final Button btnHangEx = new JoystickButton(logi, 3);
    // private final Button btnHangRet = new JoystickButton(logi, 5);

    // private final Button btnArmDown = new JoystickButton(logi, 4);
    // private final Button btnArmUp = new JoystickButton(logi, 6);

    // gamepad two player control

    // swapping between two buttons and triggers
    private final Button btnOut = new JoystickButton(gamePad, 6); // Right bump
    private final Button btnIn = new JoystickButton(gamePad, 5); // Left bump

    private final Button btnHangEx = new JoystickButton(gamePad, 4); // Y
    private final Button btnHangRet = new JoystickButton(gamePad, 2); // B
    private final Button btnArmDown = new JoystickButton(gamePad, 1); // A
    private final Button btnArmUp = new JoystickButton(gamePad, 3); // X

    public OI() {

        // triggercontrol with gamepad
        // if (gamePad.getRawAxis(3) == 1) {
        // new GoOut();
        // }
        // if (gamePad.getRawAxis(2) == 1) {
        // new TakeIn();
        // }

        // button control with joystick
        btnIn.whileHeld(new TakeIn());
        btnOut.whileHeld(new GoOut());

        // hopefully constant buttons so no worries
        // btnHangEx.whileHeld(new HangEx());
        // btnHangRet.whileHeld(new HangRet());

        btnArmUp.whileHeld(new ArmUp());
        btnArmDown.whileHeld(new ArmDown());
    }

    public boolean getInBut() {
        return btnIn.get();
    }

    public boolean getOutBut() {
        return btnOut.get();
    }

    public boolean getHangExBut() {
        return btnHangEx.get();
    }

    public boolean getHangRetBut() {
        return btnHangRet.get();
    }

    public boolean getArmUpBut() {
        return btnArmUp.get();
    }

    public boolean getArmDownBut() {
        return btnArmDown.get();
    }

    public boolean getRTrig() {
        return gamePad.getRawAxis(3) == 1;
    }

    public boolean getLTrig() {
        return gamePad.getRawAxis(2) == 1;
    }

    public Joystick getLogi() {
        return logi;
    }
}