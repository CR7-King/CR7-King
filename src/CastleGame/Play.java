package CastleGame;

import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        RunGame runGame = new RunGame();
        runGame.showWelcome();
        Scanner input = new Scanner(System.in);
        while (true) {
            String s = input.nextLine();
            String[] array = s.split(" ");
            if (array[0].equals("help")) {
                runGame.showHelp();
            } else if (array[0].equals("go")) {
                runGame.showRoom(array[1]);
            } else if (array[0].equals("bye")) {
                break;
            }
        }
        System.out.println("游戏结束！");
        input.close();
    }
}
