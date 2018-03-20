public class Elevator {
    private boolean doorOpen;
    private int floor;
    public Elevator(){//Initialize elevator
        doorOpen = true;
        floor = 1;
    }
    public boolean isDoorOpen(){//Check if the door is open
        return doorOpen;
    }
    public void openDoor(){//Set doorOpen = true if door is not opened
        if (!doorOpen)
            doorOpen = true;
    }
    public void closeDoor(){//Set doorOpen = false if door is opened
        if (doorOpen)
            doorOpen = false;
    }
    public int getFloor(){//Obtain current floor of elevator
        return floor;
    }
    public void moveUp(){//Let the elevator move up one floor
        if (doorOpen){//If the door is opened, stop move up the elevator
            System.out.println("Cannot move up when the door is open.");
            return;
        }
        if (floor == 10){//If floor is bigger than 10, stop move up
            System.out.println("Cannot move higher than 10th floor.");
            return;
        }
        floor++;
    }
    public void moveDown(){//Move down the elevator by 1 floor
        if (doorOpen){//If the door is opened, stop move down the elevator
            System.out.println("Cannot move down when the door is open.");
            return;
        }
        if (floor == 1){//Stop move down the elevator if the floor is 1
            System.out.println("Cannot move below ground floor.");
            return;
        }
        floor--;
    }
    public void moveToFloor(int floor){//Move to floor you want to go to
        if (doorOpen)//If door is opened, not move the other floor
            System.out.println("Cannot move to another floor when the door is open.");
        else if (floor < 1 || floor > 10)//If floor out of range, not move to that floor
            System.out.println("Cannot move to floor " + floor);
        else if (floor == this.floor)//If the floor is the same as current floor, return message
            System.out.println("Cannot move to the same floor.");
        else
            this.floor = floor;
    }
    public static void TestElevator(){
        Elevator elevator = new Elevator();
        System.out.println(elevator.isDoorOpen());//Check if the door is opened
        elevator.moveUp();//Test move up
        elevator.closeDoor();//Close the door of elevator
        elevator.moveDown();//Test move down
        elevator.moveToFloor(12);//Test an invalid floor
        elevator.moveToFloor(10);//Test a valid floor
        System.out.println(elevator.getFloor() == 10);//Check if the floor is 10
        elevator.moveUp();//Check if the elevator could move up when floor is 10
    }
}