package sol.in.soul.util;

import org.springframework.util.StringUtils;

public class RandomNumberGenerator {

    public static String getRandomNumber() {
        double mathRandom = Math.random();
        Integer random = (int) (mathRandom * 10000);
        String result = random.toString();
        if (result.length() != 4) {
            return getRandomNumber();
        }
        for (String s: result.split("")) {
            if (StringUtils.countOccurrencesOf(result, s) > 1) {
                return getRandomNumber();
            }
        }
        return result;
    }
}
