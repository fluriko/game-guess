package sol.in.soul.model;

import lombok.Data;

@Data
public class GameGuess {
    private boolean isGuessedRight;
    private int rightNumbers;
    private int numbersOnRightPlaces;
}
