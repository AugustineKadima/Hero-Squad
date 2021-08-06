package modules;

import modules.Hero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeroTest {
    Hero hero = new Hero();

    @Test
    public void Hero_objectCorretlyCreated(){
        Assertions.assertEquals(true, hero instanceof Hero);
    }

}
