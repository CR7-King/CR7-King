package CastleGame;

public class RunGame {

    private Room room;

    RunGame() {
        initGame();
    }

    private void initGame() {

        //创建房间
        Room study, outside, bedroom, bar, shop, lobby;
        outside = new Room("城堡外");
        lobby = new Room("大厅");
        study = new Room("书房");
        bar = new Room("酒吧");
        shop = new Room("商店");
        bedroom = new Room("卧室");

        room = outside;

        //east 右
        outside.setRoomExits(null, lobby, bar, null);
        bar.setRoomExits(null, shop, null, outside);
        lobby.setRoomExits(outside, study, shop, null);
        shop.setRoomExits(bar, bedroom, null, lobby);
        study.setRoomExits(lobby, null, bedroom, null);
        bedroom.setRoomExits(shop, null, null, study);
    }

    public void showWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入'help'。");
        System.out.println();
        System.out.println(room.getRoomExits());
    }

    public void showHelp() {
        System.out.print("迷路了吗?你可以做的命令有： go bye help");
        System.out.println("如:\tgo east ");
    }

    public void showRoom(String str) {
        room = room.getRoomDesc(str, room);
    }
}



