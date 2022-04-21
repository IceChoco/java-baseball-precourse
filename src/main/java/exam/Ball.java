package exam;

public class Ball {
    private final int position;
    private final BallNumber ballNo;

    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = new BallNumber(ballNo);
    }

    public BallStatus play(Ball ball) {
        if(this.equals(ball)){
            return BallStatus.STRIKE;
        }
        if(matchBallNo(ball.ballNo.getNo())){
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNo(int ballNo) {
        return this.ballNo.getNo() == ballNo;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Ball))
            return false;
        Ball ball = (Ball) o;
        return ball.position == this.position && ball.ballNo == this.ballNo;
    }
}
