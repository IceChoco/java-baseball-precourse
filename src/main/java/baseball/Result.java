package baseball;

public class Result {
    private int[] computer;
    private Score score;

    public Result() {
        score = new Score();
    }

    public boolean chkAnswer(int[] cNum, int[] pNum){
        computer = cNum;
        score.resetScore();

        for(int i = 0; i< pNum.length; i++)
            calcScoreByDigit(pNum[i],i);

        return printResult();
    }

    private void calcScoreByDigit(int pNum, int pIdx){
        for(int cIdx=0;cIdx< computer.length;cIdx++){
            int cNum = computer[cIdx];
            isBallOrStrike(pNum,pIdx,cNum,cIdx);
        }
    }

    private void isBallOrStrike(int pNum, int pIdx, int cNum, int cIdx){
        if(pNum == cNum && cIdx == pIdx){
            score.setStrike(score.getStrike()+1);
            return;
        }
        if(pNum == cNum){
            score.setBall(score.getBall()+1);
        }
    }

    private boolean printResult(){
        int ball   = score.getBall();
        int strike = score.getStrike();

        if(isPerfect(ball, strike)) return true;
        if(chkIsNothing(ball, strike)) return false;

        String result = makeSentence(ball, strike);
        System.out.println(result);
        return false;
    }

    private String makeSentence(int ball, int strike){
        StringBuilder sb = new StringBuilder();

        append(ball, "볼", sb);
        append(strike, "스트라이크", sb);

        return sb.toString();
    }

    private void append(int score, String expression, StringBuilder sb){
        if(score == 0)
            return;

        if(sb.length() > 0)
            sb.append(" ");

        sb.append(score).append(expression);
    }

    private boolean isPerfect(int ball, int strike){
        if(strike < 3)
            return false;

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

        return true;
    }

    private boolean chkIsNothing(int ball, int strike){
        if(ball == 0 && strike == 0){
            System.out.println("낫싱");
            return true;
        }
        return false;
    }
}
