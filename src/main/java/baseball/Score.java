package baseball;

public class Score {
    private int ball;
    private int strike;

    public Score() {
        this.ball = 0;
        this.strike = 0;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public void resetScore(){
        this.ball = 0;
        this.strike = 0;
    }
}
