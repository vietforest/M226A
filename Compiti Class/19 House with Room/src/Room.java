public class Room {
    private String roomName;
    private double superfice;

    public Room(String roomName, double superfice) {
        this.roomName = roomName;
        this.superfice = superfice;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getSuperfice() {
        return superfice;
    }

    public void setSuperfice(double superfice){
        if (superfice <= 10) {
            throw new IllegalArgumentException("Superfice must be a number bigger than 10");
        }
        else {
            this.superfice = superfice;
        }
    }


}
