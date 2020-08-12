package Projects;


import java.util.Scanner;


public class TicTacToe {   

    public static int win;  
public static int draw = 0;
    public static int currentPlayer = 1;
public static String othervalue;
public static String playerOneValue;
public static String playerTwoValue;    

public static String player = "X";


public static Scanner Mod = new Scanner(System.in); 
public static Scanner User = new Scanner(System.in);
public static String userMove;
public static String currentvalue = userMove;
public static int modMove;    
public static Scanner game = new Scanner(System.in);
public static int gameEnd;    
public static String[][] board = {{" ","|"," ", "|", " "},
                                  {"_","+","_", "+", "_"},
                                  {" ","|"," ", "|", " "},
                                  {"_","+","_", "+", "_"},
                                  {" ","|"," ", "|", " "}};
    


                                
public static void introduction(){
    System.out.println("Welcome to TicTacToe!");
    System.out.println("Player 1, Choose Your Value");
    System.out.println("X or O?");
    userMove = User.nextLine();
    currentvalue = userMove;

}


public static void moderator(){
        System.out.println("Player "+currentPlayer + " Turn!");
        System.out.println("Choose The position to place your value!");
        System.out.println("1 = TopLeft, 2 = TopMiddle, 3 = TopRight ");
        System.out.println("4 = Left, 5 = Middle, 6 = Right ");
        System.out.println("7 = BottomLeft, 8 = BottomMiddle, 9 = BottomRight ");
        System.out.println(" ");
        modMove = Mod.nextInt();
} 

public static void swicthPlayer(){
if(currentPlayer == 1){
currentPlayer = 2;
if(userMove.compareTo(player) == 0){
userMove = "O";
}else if(userMove.compareTo(player) != 0){
userMove = "X";
}
System.out.println(" ");

}else if(currentPlayer == 2){
currentPlayer = 1;
if(userMove.compareTo(player) == 0){
   userMove = "O";
   }else if(userMove.compareTo(player) != 0){
   userMove = "X";
   }


System.out.println(" ");
}
}

public static void valueOfPlayer(){
   if(userMove.compareTo(player) == 0){
      playerOneValue = "X";
      playerTwoValue = "O";
      }else if(userMove.compareTo(player) != 0){
      playerOneValue = "O";
      playerTwoValue = "X";     
      }
}   
    
public static void checkWinner(){
   if (board[0][0].compareTo(playerOneValue) == 0 && board[0][2].compareTo(playerOneValue) == 0 && board[0][4].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1; 
   }else if(board[2][0].compareTo(playerOneValue) == 0 && board[2][2].compareTo(playerOneValue) == 0 && board[2][4].compareTo(playerOneValue) == 0 ){
      System.out.println("Congratulations!");
      System.out.println("Player 1 Wins!"  );
      win = 1;
}else if(board[4][0].compareTo(playerOneValue) == 0 && board[4][2].compareTo(playerOneValue) == 0 && board[4][4].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1;
}else if(board[0][0].compareTo(playerOneValue) == 0 && board[2][0].compareTo(playerOneValue) == 0 && board[4][0].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1;
}else if(board[0][2].compareTo(playerOneValue) == 0 && board[2][2].compareTo(playerOneValue) == 0 && board[4][2].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1;
}else if(board[0][4].compareTo(playerOneValue) == 0 && board[2][4].compareTo(playerOneValue) == 0 && board[4][4].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1;
}else if(board[4][0].compareTo(playerOneValue) == 0 && board[2][2].compareTo(playerOneValue) == 0 && board[0][4].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1;
}else if(board[0][0].compareTo(playerOneValue) == 0 && board[2][2].compareTo(playerOneValue) == 0 && board[4][4].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!"  );
   win = 1;
}else if(board[0][0].compareTo(playerTwoValue) == 0 && board[0][2].compareTo(playerTwoValue) == 0 && board[0][4].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1; 
   }else if(board[2][0].compareTo(playerTwoValue) == 0 && board[2][2].compareTo(playerTwoValue) == 0 && board[2][4].compareTo(playerTwoValue) == 0 ){
      System.out.println("Congratulations!");
      System.out.println("Player 2 Wins!"  );
      win = 1;
}else if(board[4][0].compareTo(playerTwoValue) == 0 && board[4][2].compareTo(playerTwoValue) == 0 && board[4][4].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1;
}else if(board[0][0].compareTo(playerTwoValue) == 0 && board[2][0].compareTo(playerTwoValue) == 0 && board[4][0].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1;
}else if(board[0][2].compareTo(playerTwoValue) == 0 && board[2][2].compareTo(playerTwoValue) == 0 && board[4][2].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1;
}else if(board[0][4].compareTo(playerTwoValue) == 0 && board[2][4].compareTo(playerTwoValue) == 0 && board[4][4].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1;
}else if(board[4][0].compareTo(playerTwoValue) == 0 && board[2][2].compareTo(playerTwoValue) == 0 && board[0][4].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1;
}else if(board[0][0].compareTo(playerTwoValue) == 0 && board[2][2].compareTo(playerTwoValue) == 0 && board[4][4].compareTo(playerTwoValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 2 Wins!"  );
   win = 1;
}else if(draw == 8){
   System.out.println("Draw");
   win = 1;
}
}
public static void gameOver(){
   if(win == 1){
      System.out.println("Game Over");
      System.out.println("1: play again");
      System.out.println("2: end");
      currentPlayer = 1;
      draw = 0;
      board = new String[][]    { {" ","|"," ", "|", " "},
                                  {"_","+","_", "+", "_"},
                                  {" ","|"," ", "|", " "},
                                  {"_","+","_", "+", "_"},
                                  {" ","|"," ", "|", " "}};
    
      gameEnd = game.nextInt();
      if(gameEnd == 1){
         win = 0;
      tictactoeGame();
      }else if(gameEnd == 2){
System.out.println("Game Over");
      }
   }
}public static void tictactoeGame(){
   introduction();
   for(int i = 0; i <= 9; i++){
   moderator();
   printValue();
   valueOfPlayer();
   checkWinner();
   draw++;
   if(win == 1){
   i = 9;
   }
   swicthPlayer();
   gameOver();
   
   }
}
public static void printGameBoard (String[][] board) {
   for (String[] row : board) {
       for(String c : row){
          
           System.out.print(c);
       }
       System.out.println();
   }
}

static void printValue(){
   if(modMove == 1){
       board[0][0]= userMove;
       
       if(currentPlayer == 1){
          playerOneValue = userMove; 
       }else if(currentPlayer == 2){
          playerTwoValue = userMove;
       }
       printGameBoard(board); 
                                  
      }else if(modMove == 2){
      board[0][2]= userMove;
      
      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
       printGameBoard(board);
                                  
      }else if(modMove == 3){
      board[0][4]= userMove;
      
      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
                                  
      }else if(modMove == 4){
      board[2][0]= userMove;
      
      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
                                  
      }else if(modMove == 5){
      board[2][2]= userMove;
      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
                                  
      }else if(modMove == 6){
      board[2][4]= userMove;

      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
                                  
      }else if(modMove == 7){
      board[4][0]= userMove;

      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
                                  
      }else if(modMove == 8){
      board[4][2]= userMove;

      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
                                  
      }else if(modMove == 9){
      board[4][4]= userMove;
      if(currentPlayer == 1){
       playerOneValue = userMove; 
    }else if(currentPlayer == 2){
       playerTwoValue = userMove;
    }
      printGameBoard(board);
      } 
    System.out.println(" ");                  
}

    
    public static void main(String[] args) {
        
        
        
        tictactoeGame();               //The Game
        
        
        
        
     
    }
    


}
