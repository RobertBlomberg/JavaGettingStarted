import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeekOneExercisesPartTwo {
    // TODO: remove @Disabled attribute, make the test run green, and then move on to the next test
    // TODO: remember to refactor after you have a green test (never refactor when you have a failing test)

    // TODO Response: Why would you never refactor if you had a failing test?

    @Test
    public void bloodAlcoholLevelForAMale() {
        char gender = 'M';
        int weightInPounds = 185;
        int ouncesOfAlcoholConsumed = 3;
        float hoursSinceLastDrink = 2;

        float actualBAC = calculateBAC(gender, weightInPounds, ouncesOfAlcoholConsumed, hoursSinceLastDrink);

        assertEquals(0.03, actualBAC, .001);
    }

    @Test
    public void bloodAlcoholLevelForAFemale() {
        char gender = 'F';
        int weightInPounds = 135;
        int ouncesOfAlcoholConsumed = 5;
        float hoursSinceLastDrink = 1;

        float actualBAC = calculateBAC(gender, weightInPounds, ouncesOfAlcoholConsumed, hoursSinceLastDrink);

        assertEquals(0.11, actualBAC, .001);
    }

    /**
     * Given your weight, gender, number of drinks, the amount of alcohol
     * by volume of the drinks consumed, and the amount of time since your last drink,
     * calculate your Blood Alcohol Content (BAC).
     *
     * The weight quotient is 5.14 divided by the person's weight in pounds.
     * The alcohol distribution ratio is 0.73 for men and 0.66 for women.
     * The peak alcohol content is the product of the weight quotient, ounces of alcohol consumed, and the
     * alcohol distribution ratio.
     * The last consumption interval is the product of the hours since the last drink and 0.015.
     *
     * The Blood Alcohol Content is the difference between the peak alcohol content and the last consumption interval.
     *
     * @param gender
     * @param weightInPounds
     * @param ouncesOfAlcoholConsumed
     * @param hoursSinceLastDrink
     * @return
     */

    private float calculateBAC(char gender, int weightInPounds, int ouncesOfAlcoholConsumed, float hoursSinceLastDrink) {
        // TODO RESPONSE: In the PluralSight video, you learned of three ways to make decisions based on the value
        //   in the gender variable. Implement this method using one way, and describe how the other ways could work.

        return (float) (((5.14 / weightInPounds) * ((gender == 'M'?.73:.66) * ouncesOfAlcoholConsumed)) - (hoursSinceLastDrink * 0.015));
        /* Could have used an if-else statement to find the alcohol distribution ratio but would have had to have that defined prior to the formula.
           Could have used a case statement to determine the alcohol distribution ratio, but it would have either been a case statement with two
           cases or it would have duplicated all of the formula code, once for male and once for female.
        **/
    }
}
