import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {

@Test
    public void Hero_createNewHero_3Strings_int(){
    Hero hero = new Hero();
    String heroName = "Kadima";
    String superPower = "Genius";
    String weakness = "Milk";
    int age = 19;
    Assertions.assertEquals(heroName, hero.createNewHero("Kadima","Genius", "Milk",  19));

}

}
