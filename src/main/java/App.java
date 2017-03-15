import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    String player1Input = "";
    String player2Input = "";
    System.out.println("I'm a rock/paper/scissors scorer.");
    while (!player1Input.equals("rock") && !player1Input.equals("paper") && !player1Input.equals("scissors")) {
      System.out.println("Player 1, please enter rock, paper, or scissors.");
      player1Input = myConsole.readLine();
    }
    while (!player2Input.equals("rock") && !player2Input.equals("paper") && !player2Input.equals("scissors")) {
      System.out.println("Player 2, please enter rock, paper, or scissors.");
      player2Input = myConsole.readLine();
    }

    Game game = new Game();
    String gameOutcome = game.determineIfWinOrTie(player1Input, player2Input);
    if (gameOutcome.equals("tie")) {
      System.out.println("You both threw " + player1Input + ". You tied.");
    } else if (gameOutcome.equals("player1Wins")) {
      System.out.println("Player 1 threw " + player1Input + ". Player 2 threw " + player2Input + ". Player 1 wins!");
    } else if (gameOutcome.equals("player2Wins")) {
      System.out.println("Player 1 threw " + player1Input + ". Player 2 threw " + player2Input + ". Player 2 wins!");
    } else {
      System.out.println("Mission Control, we have main thruster failure.");
    }
  }
}
