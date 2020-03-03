/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package Subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;

/**
 * Add your docs here.
 */
public class Solenoids {
    static Solenoids solenoids = null;
    public static Solenoids getInstance() {
        if (solenoids == null) {
            solenoids = new Solenoids();
        }
        return solenoids;
    }

    DoubleSolenoid pcm0s01 = new DoubleSolenoid(0, 0, 1);
    DoubleSolenoid pcm0s23 = new DoubleSolenoid(0, 2, 3);
    DoubleSolenoid pcm0s45 = new DoubleSolenoid(0, 4, 5);
    DoubleSolenoid pcm0s67 = new DoubleSolenoid(0, 6, 7);
    DoubleSolenoid pcm1s01 = new DoubleSolenoid(1, 0, 1);
    DoubleSolenoid pcm1s23 = new DoubleSolenoid(1, 2, 3);
    DoubleSolenoid pcm1s45 = new DoubleSolenoid(1, 4, 5);
    DoubleSolenoid[] sols = {pcm0s01, pcm0s23, pcm0s45, pcm0s67, pcm1s01, pcm1s23, pcm1s45};

    ShuffleboardTab tab = Shuffleboard.getTab("pneumatics");

    
    public void robotInit() {
      for ( int i = 0; i < sols.length; i++) {
          sols[i].set(DoubleSolenoid.Value.kForward);
      }

    }
  
    
    public void robotPeriodic() {
  
    }
    
    
    public void teleopInit() {
      
    }
  
    
    public void teleopPeriodic() {
  
    }
  
    
    public void disabledInit() {
      
    }
}
