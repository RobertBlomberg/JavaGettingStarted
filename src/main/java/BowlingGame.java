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

        for(int roll : rolls){
            score += roll;
        }
        return score;
    }

}
