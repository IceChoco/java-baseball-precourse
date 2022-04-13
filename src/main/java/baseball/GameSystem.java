package baseball;

public class GameSystem {
    private int[] computer;
    private int[] player;

    public GameSystem() {
    }

    public void gameStart(){
        Number computerNum = new Number();
        computerNum.setRandomNumber();
        computer = computerNum.getNum();

        for(int n:computer){
            System.out.print(n+" ");
        }
    }
}
