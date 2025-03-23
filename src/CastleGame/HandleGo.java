package CastleGame;

public class HandleGo extends Handle {


    public HandleGo(RunGame game) {
        super(game);
    }

    @Override
    public void doCmd(String s) {
        game.showRoom(s);
    }
}
