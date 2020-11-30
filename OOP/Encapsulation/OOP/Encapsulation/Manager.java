package OOP.Encapsulation;



public class Manager {
    
    private String name;
    private double height;
    private int age;
    
    Manager(double height){
        setHeight(height);

    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height) {
        this.height = height; 
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void manageHeight(){
     System.out.println(getHeight());
    }
    

    public static void main(String[] args) {
        Manager hadia = new Manager(6.0);

        hadia.manageHeight();
        
        
    }


}
