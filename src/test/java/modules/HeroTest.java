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

    @Test
    public void Hero_variablesAssignable(){
        hero.Hero("Kadima", "Teleporting", "Avocado", 10);
        Assertions.assertEquals("Kadima", hero.getHeroName());
        Assertions.assertEquals("Teleporting", hero.getSuperPower());
        Assertions.assertEquals("Avocado", hero.getWeakness());
        Assertions.assertEquals(10, hero.getAge());
    }

    @Test
    public void Hero_idVariableAssignable_int(){
        hero.setHeroId(1);
        Assertions.assertEquals(1, hero.getHeroId());
    }

    @Test
    public void Hero_getCreatedHeroes_size_Hero(){
        hero.Hero("Kadima", "Teleporting", "Avocado", 10);
        hero.Hero("Samuel", "Telepathy", "Chapati", 101);
        Assertions.assertEquals(2, Hero.getCreatedHeroes().size());

    }

    @Test
    public void Hero_getHeroId_heroInstantiateWithAnID_1() throws Exception{
        Hero.clearCreatedHeroes();
        hero.Hero("Kadima", "Teleporting", "Avocado", 10);
        Assertions.assertEquals(1, hero.getHeroId());
    }

}
