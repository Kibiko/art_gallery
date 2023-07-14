import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

    Artwork turtle;
    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Picasso");
        turtle = new Artwork("Turtle", artist, 5);
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
    public void canGetArtistName(){
        assertThat(turtle.getArtist().getName()).isEqualTo("Picasso");
    }

    @Test
    public void canGetArtist(){
        assertThat(turtle.getArtist()).isEqualTo(artist);
    }

    @Test
    public void canSetArtist(){
        artist = new Artist("Kevin");
        turtle.setArtist(artist);
        assertThat(turtle.getArtist().getName()).isEqualTo("Kevin");
    }
    @Test
    public void canGetPrice(){
        assertThat(turtle.getPrice()).isEqualTo(5);
    }

    @Test
    public void canSetPrice(){
        turtle.setPrice(10);
        assertThat(turtle.getPrice()).isEqualTo(10);

    }









}
