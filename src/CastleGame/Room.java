package CastleGame;

public class Room {
    //房间名称
    private String roomName;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomExits(Room north, Room south, Room east, Room west) {
        if (north != null) {
            this.north = north;
        }
        if (south != null) {
            this.south = south;
        }
        if (east != null) {
            this.east = east;
        }
        if (west != null) {
            this.west = west;
        }
    }

    public String getRoomExits() {
        StringBuffer sb = new StringBuffer();
        if (north != null) {
            sb.append("north ");
        }
        if (south != null) {
            sb.append("south ");
        }
        if (east != null) {
            sb.append("east ");
        }
        if (west != null) {
            sb.append("west ");
        }
        System.out.println("亲，你在" + this);
        System.out.print("出口有：");
        return sb.toString();
    }

    public Room getRoomDesc(String s, Room room) {
        Room r = null;
        if (s.equals("north")) {
            r = room.north;
        }
        if (s.equals("south")) {
            r = room.south;
        }
        if (s.equals("east")) {
            r = room.east;
        }
        if (s.equals("west")) {
            r = room.west;
        }

        if (r == null) {
            r = this;
            System.out.println("这里没有门！");
            System.out.println(r.getRoomExits());
        } else {
            System.out.println("这里是" + r);
            System.out.println(r.getRoomExits());
        }
        return r;
    }

    @Override
    public String toString() {
        return roomName;
    }
}
