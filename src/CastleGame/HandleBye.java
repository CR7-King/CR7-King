package CastleGame;

public class HandleBye extends Handle {


    public HandleBye(RunGame game) {
        super(game);
    }

    @Override
    public boolean isBye() {
        return true;
    }
}
