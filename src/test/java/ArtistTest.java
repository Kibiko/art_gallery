import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtistTest {

     Artist artists;
     Gallery gallery;
     Artwork horse;

     @BeforeEach
     public void setUp(){
         gallery = new Gallery("Viewing Gallery");
         horse = new Artwork("horse", "Picasso", 60);
         Artwork elephant = new Artwork("elephant", "Picasso", 90);
         Artwork falcon = new Artwork("falcon", "Picasso", 60);
         gallery.addArtworkToGallery(horse);
         gallery.addArtworkToGallery(elephant);
         gallery.addArtworkToGallery(falcon);
         artists = new Artist();
         artists.addArtist(horse.getArtist());
         artists.addArtist(elephant.getArtist());
         artists.addArtist(falcon.getArtist());
     }
    @Test
    public void canGetArtistSize(){
            assertThat(artists.getSize()).isEqualTo(3);

    }

    @Test
    public void canAddArtist(){
            artists.addArtist("Picasso");
            assertThat(artists.getSize()).isEqualTo(4);
    }

}