package sol.in.soul.service;

import org.springframework.stereotype.Service;
import sol.in.soul.model.GameGuessResult;
import sol.in.soul.model.PlayProcess;

@Service
public class GameGuessCheckService {

    public GameGuessResult check(PlayProcess playProcess) {
        GameGuessResult gameGuessResult = new GameGuessResult();
        gameGuessResult.increaseTryNumber();

        String currentGuess = playProcess.getCurrentGuess().getGuess();
        String numberToGuess = playProcess.getNumberToGuess().getNumberToGuess();
        boolean isGuessed = currentGuess.equals(numberToGuess);

        if (isGuessed) {
            gameGuessResult.setGuessedRight(true);
        } else {
            gameGuessResult.setRightNumbers(checkCorrectNumbers(playProcess));
            gameGuessResult.setNumbersOnRightPlaces(checkNumbersOnRightPlaces(playProcess));
        }
        return gameGuessResult;
    }

    private int checkCorrectNumbers(PlayProcess playProcess) {
        int result = 0;
        String[] currentGuess = playProcess.getCurrentGuess().getGuess().split("");
        String[] numberToGuess = playProcess.getNumberToGuess().getNumberToGuess().split("");
        for (String current: currentGuess) {
            for (String number: numberToGuess) {
                if (current.equals(number)) {
                    result++;
                }
            }
        }
        return result;
    }

    private int checkNumbersOnRightPlaces(PlayProcess playProcess) {
        int result = 0;
        String[] currentGuess = playProcess.getCurrentGuess().getGuess().split("");
        String[] numberToGuess = playProcess.getNumberToGuess().getNumberToGuess().split("");
        for (int i = 0; i < currentGuess.length; i++) {
            if (currentGuess[i].equals(numberToGuess[i])) {
                result++;
            }
        }
        return result;
    }
}
