package baseball;

public class GameSystem {
    private int[] computer;
    private boolean quit = false;

    public GameSystem() {
    }

    public void gameStart(){
        Number computerNum = new Number();
        Number userNum = new Number();

        computerNum.setRandomNumber();
        computer = computerNum.getNum();
        //printComputerNum();//디버깅 편의를 위함 - 릴리즈 시 주석 필요
        gameInProgress(userNum);
    }

    private void printComputerNum(){
        for(int n:computer) System.out.print(n+" ");
    }

    public void gameInProgress(Number userNum){
        Result result = new Result();
        while(!quit){
            userNum.reqUserInput();
            int[] player = userNum.getNum();
            quit = result.chkAnswer(computer, player);
        }
    }
}