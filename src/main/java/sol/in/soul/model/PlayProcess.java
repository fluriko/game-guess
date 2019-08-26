package sol.in.soul.model;

import lombok.Data;

@Data
public class PlayProcess {
    private Player player;
    private GameGuess currentGuess;
    private NumberToGuess numberToGuess;
}
