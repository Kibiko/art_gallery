import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork horse;
    Artist artist;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Lamees", 200);
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
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Lamees");
    }

    @Test
    public void canSetName(){
        gallery.setName("Private Gallery");
        assertThat(gallery.getName()).isEqualTo("Private Gallery");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(200);
    }

    @Test
    public void canSetWallet(){
        customer.setWallet(150);
        assertThat(customer.getWallet()).isEqualTo(150);
    }

    @Test
    public void canBuyAndChangeWallet(){
        customer.buy(horse, gallery);
        assertThat(customer.getWallet()).isEqualTo(140);
        assertThat(gallery.getTill()).isEqualTo(60);
    }

    @Test
    public void didBuyAndChangeStock(){
        customer.buy(horse,gallery);
        assertThat(customer.artCollection.size()).isEqualTo(1);
        assertThat(gallery.getStockCount()).isEqualTo(2);
    }

    @Test
    public void cantBuyArt(){
        customer.setWallet(10);
        customer.buy(horse,gallery);
        assertThat(customer.getWallet()).isEqualTo(10);
    }





}
