package sol.in.soul.service;

import org.springframework.stereotype.Service;
import sol.in.soul.model.GameGuessResult;
import sol.in.soul.model.GameGuessAnswer;

import java.awt.*;

@Service
public class AnswerMakerService {
    private static final String WINNER_RESULT = "Congratulations! You guessed the number! Tries number: ";
    private static final String WRONG_RESULT = "Your guess is wrong! ";
    private static final String RIGHT_NUMBERS = " numbers are right!";
    private static final String NUMBERS_ON_RIGHT_PLACES = " numbers are on right places!";

    public GameGuessAnswer makeAnswer(GameGuessResult gameGuessResult) {
        GameGuessAnswer gameGuessAnswer = new GameGuessAnswer();
        if (gameGuessResult.isGuessedRight()) {
            gameGuessAnswer.setAnswerForPlayer(WINNER_RESULT + gameGuessResult.getTryNumber());
            gameGuessAnswer.setColor(Color.GREEN);
        } else {
            gameGuessAnswer.setAnswerForPlayer(buildWrongResultAnswer(gameGuessResult));
            gameGuessAnswer.setColor(Color.RED);
        }
        return gameGuessAnswer;
    }

    private String buildWrongResultAnswer(GameGuessResult gameGuessResult) {
        StringBuilder result = new StringBuilder();
        result.append(WRONG_RESULT)
                .append(gameGuessResult.getRightNumbers())
                .append(RIGHT_NUMBERS)
                .append(gameGuessResult.getNumbersOnRightPlaces())
                .append(NUMBERS_ON_RIGHT_PLACES);
        return result.toString();
    }
}
