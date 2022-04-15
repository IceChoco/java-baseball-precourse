package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static constant.Constant.*;

public class Application {
    public static void main(String[] args) {
        GameSystem game = new GameSystem();
        boolean restart = true;
        while(restart){
            game.gameStart();
            restart = startNewGame();
        }
    }

    private static boolean startNewGame(){
        System.out.println(MSG_END_GAME);
        String userInput = readLine().trim();

        return validRestartInput(userInput);
    }

    private static boolean validRestartInput(String input){
        if(isWrongInput(input))
            throw new IllegalArgumentException();

        return input.equals(RESTART_YES);
    }

    private static boolean isWrongInput(String input){
        return input.length() > RESTART_INPUT_SIZE ||
                !(input.equals(RESTART_YES) || input.equals(RESTART_NO));
    }
}
