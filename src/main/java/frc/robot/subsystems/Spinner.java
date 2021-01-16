/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Spinner extends SubsystemBase {
  /**
   * Creates a new Spinner.
   */

  // private final TalonSRX motor = new TalonSRX(3);

  public Spinner() { // placeholder number for now
  }

  public void spinRounds() {
    // motor.set(ControlMode.PercentOutput, .25);
  }

  public void stop() {
    // motor.set(ControlMode.PercentOutput, .25);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
