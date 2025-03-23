package CastleGame;

import java.util.HashMap;
import java.util.Scanner;

public class RunGame {

    private Room room;
    private HashMap<String, Handle> handles = new HashMap<String, Handle>();

    RunGame() {
        initGame();
        handles.put("help", new HandleHelp(this));
        handles.put("go", new HandleGo(this));
        handles.put("bye", new HandleBye(this));
    }


    private void initGame() {

        //创建房间
        Room study, outside, bedroom, bar, shop, lobby, wc;
        outside = new Room("城堡外");
        lobby = new Room("大厅");
        study = new Room("书房");
        bar = new Room("酒吧");
        shop = new Room("商店");
        bedroom = new Room("卧室");
        wc = new Room("厕所");

        room = outside;

        //east 右
        outside.setRoomExits("east", bar);
        outside.setRoomExits("south", lobby);
        lobby.setRoomExits("east", shop);
        lobby.setRoomExits("north", outside);
        lobby.setRoomExits("south", study);
        shop.setRoomExits("north", bar);
        shop.setRoomExits("west", lobby);
        shop.setRoomExits("south", bedroom);
        bar.setRoomExits("sorth", shop);
        bar.setRoomExits("west", outside);
        study.setRoomExits("east", bedroom);
        study.setRoomExits("north", lobby);
        bedroom.setRoomExits("west", study);
        bedroom.setRoomExits("nouth", shop);
        lobby.setRoomExits("up", wc);
        wc.setRoomExits("down", lobby);
    }

    public void showWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入'help'。");
        System.out.println();
        System.out.println(room.getRoomExits());
    }


    public void showRoom(String str) {
        room = room.getRoomDesc(str);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            String[] str = s.split(" ");
            Handle handle = handles.get(str[0]);
            String cmd = "";
            if (str.length > 1)
                cmd = str[1];
            if (handle != null) {
                handle.doCmd(cmd);
                if (handle.isBye()) {
                    break;
                }
            }
        }
        System.out.println("游戏结束！");
    }
}



