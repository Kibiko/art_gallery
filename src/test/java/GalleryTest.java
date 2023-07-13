import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {

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
    }

    @Test
    public void canGetGalleryName(){
        assertThat(gallery.getName()).isEqualTo("ViewingGallery");
    }

    @Test
    public void canRemoveArtwork(){
        gallery.removeArtwork(horse);
        assertThat(gallery.getStockCount()).isEqualTo(2);
    }

    @Test
    public void canGetTill(){
        assertThat(gallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        gallery.setTill(10);
        assertThat(gallery.getTill()).isEqualTo(10);
    }

    @Test
    public void canCountStock(){
        assertThat(gallery.getStockCount()).isEqualTo(3);
    }

    @Test
    public void canGetStock(){
        assertThat(gallery.getStock().size()).isEqualTo(gallery.getStockCount());
    }

    @Test
    public void canAddArtworkToGallery(){
        Artwork lion = new Artwork("lion", "Picasso", 100);
        gallery.addArtworkToGallery(lion);
        assertThat(gallery.getStockCount()).isEqualTo(4);
    }

    @Test
    public void canAddToTill(){
         gallery.addToTill(20);
         assertThat(gallery.getTill()).isEqualTo(20);
    }
}
