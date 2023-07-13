public class Artwork {

    //PROPERTIES

    private String name;
    private double price;
    private String artist;

    //CONSTRUCTOR

    public Artwork(String name, String artist, double price){
        this.name = name;
        this.artist = artist;
        this.price = price;
    }

    //BEHAVIOUR

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    

}
