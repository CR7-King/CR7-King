package CastleGame;

public class HandleHelp extends Handle {


    public HandleHelp(RunGame game) {
        super(game);
    }

    @Override
    public void doCmd(String s) {
        System.out.print("迷路了吗?你可以做的命令有： go bye help");
        System.out.println("如:\tgo east ");
    }
}
