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
@Table(name = "NUMBER_TO_GUESS")
public class NumberToGuess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NUMBER_TO_GUESS_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "PLAY_PROCESS_ID")
    private PlayProcess playProcess;

    @Column(name = "NUMBER_TO_GUESS")
    private String numberToGuess;

    @OneToOne
    @JoinColumn(name = "PLAYER_ID")
    private Player numberCreator;
}
