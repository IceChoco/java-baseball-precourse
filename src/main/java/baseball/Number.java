package baseball;

import sun.security.util.ArrayUtil;

import java.util.HashSet;

import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Number {
    private static final int START_NUM = 1;
    private static final int END_NUM = 9;
    private static final int MAX_SIZE = 3;

    private int[] num;

    public Number() {
    }

    public int[] getNum() {
        return num;
    }

    public void setRandomNumber(){
        HashSet<Integer> numSet = new HashSet<Integer>();
        while(numSet.size() < MAX_SIZE){
            numSet.add(getRandomNumber());
        }
        num = toInt(numSet);
    }

    private int[] toInt(HashSet<Integer> set){
        int[] intArr = new int[set.size()];
        int i = 0;

        for(Integer val : set)
            intArr[i++] = val;

        return intArr;
    }

    private int getRandomNumber(){
        return pickNumberInRange(START_NUM, END_NUM);
    }

}
