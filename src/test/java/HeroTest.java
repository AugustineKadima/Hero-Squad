import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {

 @Test
    public void Hero_objectCorretlyCreated(){
        Hero hero = new Hero();
        Assertions.assertEquals(true, hero instanceof Hero);
    }

}
