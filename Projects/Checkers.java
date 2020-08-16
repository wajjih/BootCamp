package Projects;

public class Checkers {






    public static void main(String[] args) {
        
        CheckerGamePiece black = new CheckerGamePiece();
        CheckerGamePiece Red = new CheckerGamePiece();

        black.color = "b";
        black.king = "B";
        
        Red.color = "r";
        Red.king = "R";
        
        black.getText();
        Red.getText();
    }
    
}

class CheckerGamePiece {

    String king;
    String color;

     void getText(){
        System.out.println(king);
        System.out.println(color);
    }    

    
}

