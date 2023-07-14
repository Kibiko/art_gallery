import java.util.ArrayList;

public class Customer {

    //PROPERTIES
    String name;
    double wallet;
    ArrayList<Artwork> artCollection;

    //CONSTRUCTOR
    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.artCollection = new ArrayList<>();
    }

    //BEHAVIOUR

    public String getName(){
        return this.name;
    }
   
    public double getWallet(){
        return this.wallet;
    }

    public void setWallet(double amount){
        this.wallet = amount;
    }

    public void buy(Artwork art, Gallery gallery){
        this.wallet -= art.getPrice();
        gallery.setTill(gallery.getTill() + art.getPrice());
        gallery.removeArtwork(art);
        this.artCollection.add(art);
    }
}
