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
            this.name.add(name);
    }

}
