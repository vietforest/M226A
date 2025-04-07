import java.util.ArrayList;
import java.util.Objects;

public class House {
    private ArrayList<Room> rooms = new ArrayList<Room>();
    public House() {}

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room getRooms(int index) {
        if (index >= 0 && index < rooms.size()) {
            return rooms.get(index);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String roomsString = "";
        for (int i = 0; i < rooms.size(); i++) {
            roomsString += i +":"+ rooms.get(i).getRoomName() + ", Superfice: " + rooms.get(i).getSuperfice()+"\n";
        }

        return "House{" +"\n"+
                "rooms:" + "\n" + roomsString +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(rooms, house.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rooms);
    }
}
