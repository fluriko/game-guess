package sol.in.soul.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "GAME_PLAYER")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PLAYER_ID")
    private Long id;

    @Column(name = "PLAYER_NAME", nullable = false)
    private String playerName;

    @Column(name = "BEST_SCORE")
    private GameScore bestScore;

    @OneToMany(mappedBy = "player")
    private List<GameScore> gameScores = new ArrayList<>();
}
