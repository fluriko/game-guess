package sol.in.soul.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "PLAY_PROCESS")
public class PlayProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAY_PROCESS_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "PLAYER_ID")
    private Player player;

    @OneToOne
    @JoinColumn(name = "GAME_GUESS_ID")
    private GameGuess currentGuess;
}