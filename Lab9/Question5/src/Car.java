public class Car {
    private String name;
    private Door[] doors;

    public Car(String name, int numberOfDoors) throws BadCarException {
        this.name = name;
        if (numberOfDoors < 1)
            throw new BadCarException();
        doors = new Door[numberOfDoors];
        for (int i = 0; i < numberOfDoors; i++)
            doors[i] = new Door();
    }

    public void listDoors() {
        for (Door d : doors) {
            System.out.print(name + ": door is ");
            if (d.isOpen())
                System.out.println("open");
            else
                System.out.println("closed");
        }
    }

    public int countOpenDoors() {
        int count = 0;
        for (Door d : doors) {
            if (d.isOpen())
                count++;
        }
        return count;
    }

    public void openOneDoor(int doorNumber) throws BadDoorException {
        if (doorNumber < 1 || doorNumber > doors.length)
            throw new BadDoorException(doorNumber);
        if (!doors[doorNumber - 1].isOpen())
            doors[doorNumber - 1].open();
    }

    public void changeAllDoors() {
        for (Door d : doors) {
            if (d.isOpen())
                d.close();
            else 
                d.open();
        }
    }

    public void replaceDoor(int doorNumber) throws BadDoorException {
        if (doorNumber < 1 || doorNumber > doors.length)
            throw new BadDoorException(doorNumber);
        doors[doorNumber - 1] = new Door();
    }

    public void replaceAllDoors() { //If we you enhanced for loop, the elements in the array will keep unchanged
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door();
        }
    }

    public void replaceManyDoors(int numOfDoorsToReplace) throws BadDoorException {
        //If we replace more doors than the car have, it will throw BadDoorException
        for (int i = 1; i <= numOfDoorsToReplace; i++) {
            replaceDoor(i);
        }
    }

    public static void testCar() {
        try {
            Car lexus = new Car("Tiny", 4);
            lexus.listDoors();
            System.out.println(lexus.countOpenDoors() == 0);
            lexus.openOneDoor(1);
            lexus.listDoors();
            System.out.println(lexus.countOpenDoors() == 1);
            lexus.changeAllDoors();
            lexus.listDoors();
            lexus.replaceDoor(3);
            System.out.println(lexus.countOpenDoors() == 2);
            lexus.listDoors();
            System.out.println("After replace all doors");
            lexus.replaceAllDoors();
            lexus.listDoors();
            lexus.replaceManyDoors(5);
            lexus.openOneDoor(6);

        }
        catch (BadCarException | BadDoorException e) {
            System.out.println(e);
        }
    }
}
