package org.bloomtech.bd.codealong;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCountTest {

    @Test
    void test_letterCountSolution_returnsCorrectValue() {
        LetterCount letterCount = new LetterCount();
        int result = letterCount.solution("yngfhsrtugenrodiaxznsjscgsmnpvzfzirqekabzarzattewwcwqmemvtj", 'j');
        assertEquals(2, result, "Letter Count Tests Failed");
        int result2 = letterCount.solution("wivkvxokrpienbhjzudlmifgbcbhqvdjwcgsvsohxupnkjdvnrfglcfmnuixurvvljkslkaocbdlhrwxt", 'g');
        assertEquals(3, result2, "Letter Count Tests Failed");
        int result3 = letterCount.solution("kfhgqgvznqdjncfkvzfvqoilcuqmxftytbyjgamjwqnxvrwapwtaitfyyphmvjtvsbs", 'y');
        assertEquals(4, result3, "Letter Count Tests Failed");
        int result4 = letterCount.solution("rqjdqpigivibhestdsptyqwxpwrkwnilllbensnxrfkgqvxyqitxtnancdczfhvdskuhckuofzqfssiesnnintdagvfzntxzfqsg", 'r');
        assertEquals(3, result4, "Letter Count Tests Failed");
        int result5 = letterCount.solution("", 'a');
        assertEquals(0, result5, "Letter Count Tests Failed");
    }
}
