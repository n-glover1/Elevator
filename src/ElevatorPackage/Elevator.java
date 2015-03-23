/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ElevatorPackage;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Noah
 */
public class Elevator {

    boolean DoorOpen = false;
    int CurrentFloor = 1;
    int TargetFloor = 1;
    boolean Occupied = false;
    boolean Moving = false;
    Timer Timer = new Timer();

    public Elevator() {

    }

    class TimeTask extends TimerTask {

        public void run() {
            Timer.cancel();
        }
    }

    public int getFloor() {
        return CurrentFloor;
    }

    public boolean setTargetFloor(int targetFloor) {
        if (targetFloor == CurrentFloor) {
            return true;
        }
        TargetFloor = targetFloor;
        return true;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public boolean isMoving() {
        return Moving;
    }

    public boolean isDoorOpen() {
        return DoorOpen;
    }

    public void OpenDoor() {
        //2 second timer for opening door
        Timer.schedule(new TimeTask(), 2000);
        DoorOpen = true;
        //5 second timer for hold
        Timer.schedule(new TimeTask(), 5000);
        //CloseDoor()
        CloseDoor();
    }

    public boolean CloseDoor() {
        //2 second timer for closing door
        DoorOpen = false;
        Timer.schedule(new TimeTask(), 2000);
        return true;
    }

    public void move() {
        if (DoorOpen == true) {
            CloseDoor();
        }

        //6 second timer for moving between a floor
        //CurrentFloor < TargetFloor --
        while (CurrentFloor != TargetFloor) {
            if (CurrentFloor < TargetFloor) {
                Timer.schedule(new TimeTask(), 6000);
                CurrentFloor++;
            }
            if (CurrentFloor > TargetFloor) {
                Timer.schedule(new TimeTask(), 6000);
                CurrentFloor--;
            }
        }
        OpenDoor();
    }
}
