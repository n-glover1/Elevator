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
    boolean isHolding = true;
    Timer Timer = new Timer();

    public Elevator() {

    }


    public int getFloor() {
        return CurrentFloor;
    }
    
    public void setCurrentFloor(int currentFloor) {
        CurrentFloor = currentFloor;
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

    public boolean OpenDoor() {

        //2 second timer for opening door
        Timer.schedule(new OpenTask(), 2000);

        while (!DoorOpen) {
            System.out.print("");
        }
        //HoldDoor();
        
        return true;
    }

    public boolean HoldDoor() {
        //5 second timer for hold
        Timer.schedule(new HoldTask(), 5000);

        while (isHolding) {
            System.out.print("");
        }
        CloseDoor();
        return true;
    }

    public boolean CloseDoor() {
        //2 second timer for closing door
        Timer.schedule(new CloseTask(), 2000);
        while (DoorOpen) {
            System.out.print("");
        }
        return true;

    }

    public void move() {
        
        int differance = TargetFloor - CurrentFloor;
        if (differance < 0) {
            differance *= -1;
        }
        Moving = true;

        for (int i = 0; i < differance; i++) {
            Timer.schedule(new MoveTask(), 6000);
            while (Moving) {
                System.out.print("");
            }
            CurrentFloor++;
            if(i == differance-1) {
                OpenDoor();
            }
            Moving = true;
        }
    }
        class OpenTask extends TimerTask {

        public void run() {
            DoorOpen = true;
        }
    }
    class CloseTask extends TimerTask {

        public void run() {
            DoorOpen = false;
        }
    }
    class MoveTask extends TimerTask {

        public void run() {
            Moving = false;
        }
    }
    class HoldTask extends TimerTask {

        public void run() {
            isHolding = false;

        }
    }

}
