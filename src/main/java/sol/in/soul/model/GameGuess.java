package sol.in.soul.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "GAME_GUESS")
public class GameGuess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GAME_GUESS_ID")
    private Long id;

    @Column(name = "GUESS")
    private String guess;

    @Column(name = "TRY_NUMBER")
    private int tryNumber;
}
