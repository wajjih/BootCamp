package Projects;

import java.util.Scanner;

public class TicTacToe {
    
    
    public static void main(String[] args) {
        
        // My steps to make this game so far
        //The scanner works now, Use it to input the values into the Array
        //Add a scanner question in which it asks where to input the values and which option you'll like to play as (O or X)
        //Create User and Computer variables and Use if else statments to decide who wins

       
        System.out.println("Welcome to TicTacToe!"); //Introduction
        System.out.println("Choose Your Value");
        System.out.println("X or O?");
        
        Scanner User = new Scanner(System.in); //The User Decides which role they play
        String userMove = User.nextLine();



        
        Scanner Mod = new Scanner(System.in); // Moderates the position the user chooses
        System.out.println("Choose The position to place your value!");
        System.out.println("TopLeft, TopMiddle, TopRight ");
        System.out.println("Left, Middle, Right ");
        System.out.println("BottomLeft, BottomMiddle, BottomRight ");

        

        String modMove = Mod.nextLine(); 
        
        
        
        String[][] board = {{" ","|"," ", "|", " "}, // The Board
                            {"_","+","_", "+", "_"},
                            {" ","|"," ", "|", " "},
                            {"_","+","_", "+", "_"},
                            {" ","|"," ", "|", " "}};
        for (String[] row : board) {    //Don't Understand how this For each thing works, but it prints out the board :)
            for(String c : row){
                System.out.print(c);
            }
            System.out.println();
        }


        if(modMove == "Left"){
            board[2][0]= userMove;
            System.out.println(board); //Prints the board with the value the User assigns
            
        }
        System.out.println(userMove);
    }
}