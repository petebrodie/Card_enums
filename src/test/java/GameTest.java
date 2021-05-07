import org.junit.Before;
import org.junit.Test;

public class GameTest {

    Dealer dealer;
    Deck deck;
    Player player1;
    Player player2;
    Game game;

    @Before
    public void setUp() {
        this.dealer = new Dealer();
        this.deck = new Deck();
        this.player1 = new Player();
        this.player2 = new Player();
        this.game = new Game();

    }

    @Test
    public void player1Win() {

    }



}
