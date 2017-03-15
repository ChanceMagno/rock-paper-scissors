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

  @Test
  public void determineIfWinOrTie_returnWinForPlayer1_Player1Wins() {
    Game game1= new Game();
    String expected = "player 1 wins!";
    assertEquals(expected, game1.determineIfWinOrTie("rock", "scissors"));
    assertEquals(expected, game1.determineIfWinOrTie("paper", "rock"));
    assertEquals(expected, game1.determineIfWinOrTie("scissors", "paper"));
  }
  @Test
  public void determineIfWinOrTie_returnWinForPlayer2_Player2Wins() {
    Game game1= new Game();
    String expected = "player 2 wins!";
    assertEquals(expected, game1.determineIfWinOrTie("paper", "scissors"));
    assertEquals(expected, game1.determineIfWinOrTie("rock", "paper"));
    assertEquals(expected, game1.determineIfWinOrTie("scissors", "rock"));
  }
}
