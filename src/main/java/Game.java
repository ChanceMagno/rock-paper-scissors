

public class Game {

  public String determineIfWinOrTie(String player1, String player2){
    String outCome = "";
    if (player1.equals(player2)){
          outCome = "tie";
    } else if(player1.equals("rock") && player2.equals("scissors") || player1.equals("paper") && player2.equals("rock") || player1.equals("scissors") && player2.equals("paper")){
      outCome = "player1Wins";
    } else if(player1.equals("paper") && player2.equals("scissors") || player1.equals("scissors") && player2.equals("rock") || player1.equals("rock") && player2.equals("paper")){
      outCome = "player2Wins";
    }
    return outCome;
  }
}
