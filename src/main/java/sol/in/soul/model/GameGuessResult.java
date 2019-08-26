package sol.in.soul.model;

import lombok.Data;

@Data
public class GameGuessResult {
    private boolean isGuessedRight;
    private int rightNumbers;
    private int numbersOnRightPlaces;
    private int tryNumber;
}
