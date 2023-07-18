import org.example.BowlingGame;
import org.example.Game;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    @Test
    public void testGutterGame(){
        Game game = new BowlingGame();

        for(int i=0;i<20;i++){
            game.roll(0);
        }

        Assertions.assertEquals(0, game.score());
    }

    @Test
    public void testAllOneGame(){
        Game game = new BowlingGame();
        for(int i=0;i<20;i++){
            game.roll(1);
        }
        Assertions.assertEquals(20, game.score());
    }

    @Test
    public void testAllStrikes(){
        Game game = new BowlingGame();
        for(int i=0;i<12;i++){
            game.roll(10);
        }
        Assertions.assertEquals(300, game.score());
    }


}
