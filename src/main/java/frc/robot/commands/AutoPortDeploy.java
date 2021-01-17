/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;

public class AutoPortDeploy extends SequentialCommandGroup {
  public AutoPortDeploy(DriveTrain drive, Intake intake, double seconds, double speed) {
    super(new AutoForward(drive, seconds, speed), new AutoOutput(intake));
  }
}
