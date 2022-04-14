package baseball;

import java.util.HashSet;

import static camp.nextstep.edu.missionutils.Console.readLine;
import static camp.nextstep.edu.missionutils.Randoms.pickNumberInRange;

public class Number {
    private static final int START_NUM = 1;
    private static final int END_NUM = 9;
    private static final int MAX_SIZE = 3;
    private static final String NUM_RANGE = "^[1-9]*$";

    private int[] num;

    public Number() {
    }

    public int[] getNum() {
        return num;
    }

    public void reqUserInput(){
        System.out.print("숫자를 입력해주세요: ");
        String userInput = readLine();

        userInput = userInput.trim();
        if(validUserInput(userInput)){
            setUserInput(userInput);
        }
    }

    public void setUserInput(String userInput){
        char[] numCharArr = userInput.toCharArray();
        num = toInt(numCharArr);
    }

    public boolean callValidUserInput(String input){
        return validUserInput(input);
    }

    private boolean validUserInput(String input){
        if(!chkLength(input) || !chkRange(input) || !chkUnique(input)){
            throw new IllegalArgumentException();
        }
        return true;
    }

    private boolean chkLength(String input){
        return input.length() == MAX_SIZE;
    }

    private boolean chkRange(String input){
        return input.matches(NUM_RANGE);
    }

    private boolean chkUnique(String input){
        HashSet<Character> numSet = new HashSet<>();
        for(int i=0;i<input.length();i++)
            numSet.add(input.charAt(i));
        return numSet.size() == MAX_SIZE;
    }

    public void setRandomNumber(){
        HashSet<Integer> numSet = new HashSet<>();
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

    private int[] toInt(char[] arr){
        int[] intArr = new int[arr.length];
        int i = 0;

        for(char val : arr)
            intArr[i++] = val - '0';

        return intArr;
    }

    private int getRandomNumber(){
        return pickNumberInRange(START_NUM, END_NUM);
    }

}
