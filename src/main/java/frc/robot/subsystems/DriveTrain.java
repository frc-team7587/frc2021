/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /**
   * Creates a new DriveTrain.
   */
  private final SpeedController left1 = new PWMVictorSPX(0);
  private final SpeedController left2 = new PWMVictorSPX(1);
  private final SpeedController right1 = new PWMVictorSPX(2);
  private final SpeedController right2 = new PWMVictorSPX(3);

  private final SpeedControllerGroup left = new SpeedControllerGroup(left1, left2);
  private final SpeedControllerGroup right = new SpeedControllerGroup(right1, right2);

  private final DifferentialDrive m_drive = new DifferentialDrive(left, right);

  public DriveTrain() {

  }

  public void drive(double speed, double rotation) {
    m_drive.arcadeDrive(speed, rotation);
  }

  public void stop() {
    m_drive.arcadeDrive(0, 0);
  }

  @Override
  public void setDefaultCommand(Command defaultCommand) {
    // TODO Auto-generated method stub
    super.setDefaultCommand(defaultCommand);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
