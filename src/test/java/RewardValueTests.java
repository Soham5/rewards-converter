import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cash=100;
        int expectedMiles = (int)(cash / 0.0035);
        var converter = new RewardValue(cash);
        assertEquals(expectedMiles,converter.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int miles=100;
        double expectedCash = miles * 0.0035;
        var converter = new RewardValue(miles);
        assertEquals(expectedCash,converter.getCashValue());
    }
}
