/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import static frc.robot.Constants.*;
// import edu.wpi.first.wpilibj.PWMSparkMax;
// import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  /**
   * Creates a new Arm.
   */
  private final CANSparkMax sparky = new CANSparkMax(1, MotorType.kBrushless);

  public void raise() {
    sparky.set(-ARM_MAX_SPEED);
  }

  public void lower() {
    sparky.set(0.25 * ARM_MAX_SPEED);
  }

  public void stop() {
    sparky.set(0);
  }

  public void reset() {
    sparky.restoreFactoryDefaults();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
