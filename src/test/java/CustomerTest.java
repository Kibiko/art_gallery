import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork horse;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Lamees", 200);
        gallery = new Gallery("Viewing Gallery");
        horse = new Artwork("horse", "Picasso", 60);
        Artwork elephant = new Artwork("elephant", "Picasso", 90);
        Artwork falcon = new Artwork("falcon", "Picasso", 60);
        gallery.addArtworkToGallery(horse);
        gallery.addArtworkToGallery(elephant);
        gallery.addArtworkToGallery(falcon);
    }

    @Test
    public void hasName(){
        assertThat(customer.getName()).isEqualTo("Lamees");
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
    public void canBuy(){
        customer.buy(horse.getPrice(), gallery);
        assertThat(customer.getWallet()).isEqualTo(140);
        assertThat(gallery.getTill()).isEqualTo(60);

    }





}
