package sol.in.soul.service;

import org.springframework.stereotype.Service;
import sol.in.soul.model.GameGuess;

@Service
public class CheckGuessService {
    private static final String WINNER_RESULT = "Congratulations! You guessed the number!";
    private static final String WRONG_RESULT = "Your guess is wrong! ";
    private static final String RIGHT_NUMBERS = " numbers are right!";
    private static final String NUMBERS_ON_RIGHT_PLACES = " numbers are on right places!";

    public String check(GameGuess gameGuess) {
        if (gameGuess.isGuessedRight()) {
            return WINNER_RESULT;
        }
        return buildWrongResultAnswer(gameGuess);
    }

    private String buildWrongResultAnswer(GameGuess gameGuess) {
        StringBuilder result = new StringBuilder();
        result.append(WRONG_RESULT)
                .append(gameGuess.getRightNumbers())
                .append(RIGHT_NUMBERS)
                .append(gameGuess.getNumbersOnRightPlaces())
                .append(NUMBERS_ON_RIGHT_PLACES);
        return result.toString();
    }
}
