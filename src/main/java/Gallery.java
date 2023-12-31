import java.util.ArrayList;

public class Gallery {

    //properties

    private String name;

    private double till;

    private ArrayList<Artwork> stock;

    //constructor
    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock= new ArrayList<Artwork>();
    }

    //behaviour /methods
    public String getName(){
        return this.name;
   }

   public void setName(String name){
        this.name = name;
   }
   public void removeArtwork(Artwork art){
       this.stock.remove(art);
   }

   public double getTill(){
        return this.till;
   }

   public void setTill(double amount){
        this.till = amount;
   }

   public void addToTill(double amount){
        this.till += amount; // this.till = this.till + amount
   }

   public int getStockCount(){
        return this.stock.size();
   }

   public ArrayList<Artwork> getStock(){
        return this.stock;
   }

   public void addArtworkToGallery(Artwork artwork){
        this.stock.add(artwork);
   }

   public double stock_take(){
        double sum = 0;
        for (Artwork art : this.stock){
            sum += art.getPrice();
        }
        return sum;
   }




}
