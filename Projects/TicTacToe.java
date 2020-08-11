package Projects;

import java.util.Scanner;
//import java.util.function.Function;

public class TicTacToe {   

    public static int win;  
public static int currentPlayer = 1;
public static String playerOneValue;
public static String playerTwoValue;    
public static Scanner Mod = new Scanner(System.in); 
public static Scanner User = new Scanner(System.in);
public static String userMove;
public static int modMove;    
    
public static String[][] board = {{" ","|"," ", "|", " "},
                                  {"_","+","_", "+", "_"},
                                  {" ","|"," ", "|", " "},
                                  {"_","+","_", "+", "_"},
                                  {" ","|"," ", "|", " "}};
    


                                
public static void introduction(){
    System.out.println("Welcome to TicTacToe!"); //Introduction
    System.out.println("Player 1, Choose Your Value");
    System.out.println("X or O?");
    userMove = User.nextLine();

}


public static void moderator(){
        System.out.println("Choose The position to place your value!");
        System.out.println("1 = TopLeft, 2 = TopMiddle, 3 = TopRight ");
        System.out.println("4 = Left, 5 = Middle, 6 = Right ");
        System.out.println("7 = BottomLeft, 8 = BottomMiddle, 9 = BottomRight ");
        modMove = Mod.nextInt();
} 

public static void swicthPlayer(){
if(currentPlayer == 1){
currentPlayer = 2;
userMove = "O";
System.out.println("Player 2 Turn!");
}else if(currentPlayer == 2){
currentPlayer = 1;
userMove = "X";
System.out.println("Player 1 Turn!");
}
}

public static void valueOfPlayer(){
    if(userMove == "X"){
    playerOneValue = "X";
    }else if(userMove == "O"){
    playerTwoValue = "O";
    }
}
    
public static void checkWinner(){
   if (board[0][0].compareTo(playerOneValue) == 0 && board[0][2].compareTo(playerOneValue) == 0 && board[0][4].compareTo(playerOneValue) == 0 ){
   System.out.println("Congratulations!");
   System.out.println("Player 1 Wins!");
   win = 1; 
   }
}


    
    public static void main(String[] args) {
        
        
        // My steps to make this game so far
        //The scanner works now, Use it to input the values into the Array
        //Add a scanner question in which it asks where to input the values and which option you'll like to play as (O or X)
        //Create User and Computer variables and Use if else statments to decide who wins
        //make conditions for when someone wins game and when they lose
        //I was thinking make all possible wins for both X and O, but anything that doesn't fall into place is a draw

       
        
        introduction();
        for(int i = 0; i <= 9; i++){
        moderator();
        printValue();
        swicthPlayer();
        checkWinner();
        if(win == 1){
            i = 8;
        }

        
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
    }

}
