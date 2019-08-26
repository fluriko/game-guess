package sol.in.soul.service;

import org.springframework.stereotype.Service;
import sol.in.soul.model.GameGuess;
import sol.in.soul.model.GameGuessResult;

@Service
public class GameGuessCheckService {

    public GameGuessResult check(GameGuess gameGuess) {
        GameGuessResult gameGuessResult = new GameGuessResult();
        gameGuessResult.setTryNumber(gameGuess.getTryNumber());
        //TODO CHECK REALISATION
        return gameGuessResult;
    }
}
