package CastleGame;

public class Handle {
    protected RunGame game;

    public Handle(RunGame game) {
        this.game = game;
    }

    public void doCmd(String s) {
    }

    public boolean isBye() {
        return false;
    }
}
