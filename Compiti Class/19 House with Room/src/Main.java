public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.addRoom(new Room("Big",30));
        house.addRoom(new Room("Small",10));
        house.addRoom(new Room("Medium",20));
        house.addRoom(new Room("Medium",20));
        house.addRoom(new Room("Medium",20));
        house.addRoom(new Room("Medium",20));
        house.addRoom(new Room("Medium",20));

        System.out.println(house);
    }
}