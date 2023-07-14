import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ArtistTest {

     Artist artist;
     Gallery gallery;
     Artwork horse;

     @BeforeEach
     public void setUp(){
         gallery = new Gallery("Viewing Gallery");
         artist = new Artist("Picasso");
         horse = new Artwork("horse", artist, 60);
         Artwork elephant = new Artwork("elephant", artist, 90);
         Artwork falcon = new Artwork("falcon", artist, 60);
         gallery.addArtworkToGallery(horse);
         gallery.addArtworkToGallery(elephant);
         gallery.addArtworkToGallery(falcon);
     }

     @Test
    public void canGetArtist(){
         assertThat(artist.getName()).isEqualTo("Picasso");
     }


}