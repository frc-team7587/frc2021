/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
  TalonSRX talon = new TalonSRX(INTAKE_TALON_ID);

  public void in() {
    talon.set(ControlMode.PercentOutput, INTAKE_MAX_SPEED); // may need to change this number later
  }

  public void out() {
    talon.set(ControlMode.PercentOutput, -INTAKE_MAX_SPEED); // also a guesstimate number
  }

  public void stop() {
    talon.set(ControlMode.PercentOutput, 0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
