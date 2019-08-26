package sol.in.soul.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "GAME_SCORE")
public class GameScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCORE_ID")
    private Long id;

    @Column(name = "SCORE_VALUE", nullable = false)
    private Integer scoreValue;

    @Column(name = "NUMBER_TO_GUESS", nullable = false)
    private String numberToGuess;

    @ManyToOne
    @JoinColumn(name = "PLAYER_ID")
    private Player player;
}
