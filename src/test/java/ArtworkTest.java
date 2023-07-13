import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork turtle;

    @BeforeEach
    public void setUp(){
        turtle = new Artwork("Turtle", "Picasso", 5);

    }

    @Test
    public void canGetArtName(){
        assertThat(turtle.getName()).isEqualTo("Turtle");

    }

    @Test
    public void canSetName(){
        turtle.setName("Tortoise");
        assertThat(turtle.getName()).isEqualTo("Tortoise");

    }

    @Test
    public void canGetArtist(){
        assertThat(turtle.getArtist()).isEqualTo("Picasso");
    }

    @Test
    public void canSetArtist(){
        turtle.setArtist("Kevin");
        assertThat(turtle.getArtist()).isEqualTo("Kevin");
    }
    @Test
    public void canGetPrice(){
        assertThat(turtle.getPrice()).isEqualTo(5);
    }

    @Test
    public void canSetPrice(){
        turtle.setPrice(10);
        assertThat(turtle.getPrice())isEqualTo(10);
       
    }









}
