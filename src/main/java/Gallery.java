import java.util.ArrayList;

public class Gallery {

    private String name;

    private double till;

    private ArrayList<Artwork> stock;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.stock= new ArrayList<Artwork>();
    }

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




}
