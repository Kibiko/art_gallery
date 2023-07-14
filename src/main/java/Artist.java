import java.util.ArrayList;

public class Artist {

    //PROPERTIES

    private ArrayList<String> name;

    public Artist(){
        this.name = new ArrayList<>();
    }

    public int getSize(){
        return this.name.size();
    }

    public void addArtist(String name){
        if(this.name.contains(name)) {
            System.out.println("Arist already registered");
        } else{
            this.name.add(name);
        }
    }

}
