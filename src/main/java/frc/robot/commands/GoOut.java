/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class GoOut extends CommandBase {
  /**
   * Creates a new GoOut.
   */
  public GoOut() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Robot.m_intake.out();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.m_intake.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return !Robot.m_oi.getOutBut();
    // return !Robot.m_oi.getRTrig();
  }
}
