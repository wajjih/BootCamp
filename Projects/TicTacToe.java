package Projects;

import java.util.Scanner;

public class TicTacToe {
    
    
    public static void main(String[] args) {
        
        //Scanner computerMove = new Scanner();
        //int compMove = computerMove.nextInt();

        
        char[][] board = {{' ','|',' ', '|', ' '},
                          {'_','+','_', '+', '_'},
                          {' ','|',' ', '|', ' '},
                          {'_','+','_', '+', '_'},
                          {' ','|',' ', '|', ' '}};
        for (char[] row : board) {
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}