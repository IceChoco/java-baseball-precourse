package constant;

public class Constant {
    public static final int START_NUM = 1;
    public static final int END_NUM = 9;
    public static final int MAX_SIZE = 3;
    public static final String NUM_RANGE = "^["+START_NUM+"-"+END_NUM+"]*$";

    public static final int RESTART_INPUT_SIZE = 1;
    public static final String RESTART_YES = "1";
    public static final String RESTART_NO = "2";

    /*Term*/
    public static final String BALL = "볼";
    public static final String STRIKE = "스트라이크";
    public static final String NOTHING = "낫싱";

    /*Message*/
    public static final String MSG_END_GAME="3개의 숫자를 모두 맞히셨습니다! 게임 종료" +
            "\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요";
    public static final String MSG_ENTER_NUMBER="숫자를 입력해주세요: ";
}
