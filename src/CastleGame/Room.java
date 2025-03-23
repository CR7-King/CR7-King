package CastleGame;

import java.util.HashMap;

public class Room {
    //房间名称
    private String roomName;
    private HashMap<String, Room> rooms = new HashMap<String, Room>();


    public Room(String roomName) {
        this.roomName = roomName;
    }


    public void setRoomExits(String str, Room room) {
        rooms.put(str, room);
    }

    public String getRoomExits() {
        StringBuffer sb = new StringBuffer();
        for (String s : rooms.keySet()) {
            sb.append(s + " ");
        }
        System.out.println("你现在：" + this);
        System.out.print("出口有：");
        return sb.toString();
    }

    public Room getRoomDesc(String s) {
        Room r = null;
        r = rooms.get(s);
        if (r == null) {
            System.out.println("这里没有门！");
            r = this;
            System.out.println(r.getRoomExits());
        } else {
            System.out.println(r.getRoomExits());
        }
        return r;
    }

    @Override
    public String toString() {
        return roomName;
    }
}
