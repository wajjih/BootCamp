package OOP.Encapsulation;

public class StockKeeper {
    private String name;
    
    StockKeeper(String name) {
        setName(name);
    }
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
         /*
          Defining states and behaviors for album
          */
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);
          /*
          Printing album details
           */
        System.out.println("Album managed by :"+ getName());
        System.out.println("Album details::::::::::");
        System.out.println("Album name : " + album.getName());
        System.out.println("Album artist : " + album.getArtist());
        System.out.println("Album price : " + album.getPrice());
        System.out.println("Album number of copies : " + album.getNumberOfCopies());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }




public static void main(String[] args) {
    StockKeeper johnDoe = new StockKeeper("John Doe");
       /*
       Stock keeper creates album and assigns negative values for price and number of copies available
        */
       johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
}
}
    

