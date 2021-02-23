public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    // Tenth frame has an extra roll.
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: index starts at zero and using the postfix it will get the array ready for the next roll.
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero?
        // Arrays are zero-based.

        for(int frame = 1, firstRollInFrame = 0; frame <= 10; frame++){
            if (isAStrike(firstRollInFrame)){
                score += scoreAStrike(firstRollInFrame);
                firstRollInFrame +=1;
            }
            else if (isASpare(firstRollInFrame)){
                score += scoreASpare(firstRollInFrame);
                firstRollInFrame += 2;
            }
            else {
                score += scoreOpenFrame(firstRollInFrame);
                firstRollInFrame += 2;
            }
        }
        return score;
    }

    private int scoreOpenFrame(int roll) {
        return rolls[roll] + rolls[roll + 1];
    }

    private int scoreASpare(int roll) {
        return 10 + rolls[roll + 2];
    }

    private int scoreAStrike(int roll) {
        return 10 + rolls[roll + 1] + rolls[roll + 2];
    }

    private boolean isASpare(int firstRollInFrame) {
        return rolls[firstRollInFrame] + rolls[firstRollInFrame + 1] == 10;
    }

    private boolean isAStrike(int firstRollInFrame) {
        return rolls[firstRollInFrame] == 10;
    }
}




