import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void determineIfWinOrTie_returnTieForRockRock_Tie() {
    Game game1 = new Game();
    String expected = "tie";
    assertEquals(expected, game1.determineIfWinOrTie("rock", "rock"));
    assertEquals(expected, game1.determineIfWinOrTie("paper", "paper"));
    assertEquals(expected, game1.determineIfWinOrTie("scissors", "scissors"));
  }


}
