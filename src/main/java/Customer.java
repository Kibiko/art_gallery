public class Customer {

    //PROPERTIES
    String name;
    double wallet;

    //CONSTRUCTOR
    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
     
    }
    
   public String getName(){
    return this.name;
    
   }
   
   public double getWallet(){
    return this.wallet;

   }

   public void setWallet(double amount){
    this.wallet = amount;

   }

   public void buy(double price, Gallery gallery){
    this.wallet -= price;
    gallery.setTill(gallery.getTill() + price);
    
   }

    //BEHAVIOUR
}
