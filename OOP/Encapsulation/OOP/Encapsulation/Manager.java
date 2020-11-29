package OOP.Encapsulation;



public class Manager {
    
    private String name;
    private double height;
    private int age;
    
    public Manager(){
        height = 6.0;

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


}
