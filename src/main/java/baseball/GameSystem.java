package baseball;

public class GameSystem {
    private int[] computer;
    private int[] player;
    private boolean quit = false;

    public GameSystem() {
    }

    public void gameStart(){
        Number computerNum = new Number();
        Number userNum = new Number();

        computerNum.setRandomNumber();
        while(!quit){
            userNum.reqUserInput();
            quit = true;
        }
    }

}