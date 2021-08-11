package modules;

import modules.Hero;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class HeroTest {

    @Test
    public void Hero_objectCorretlyCreated(){
        Hero hero = new Hero("Kadima", "Teleporting", "Avocado", 10);

        Assertions.assertEquals(true, hero instanceof Hero);
    }

    @Test
    public void Hero_variablesAssignable(){
        Hero hero = new Hero("Kadima", "Teleporting", "Avocado", 10);
        Assertions.assertEquals("Kadima", hero.getHeroName());
        Assertions.assertEquals("Teleporting", hero.getSuperPower());
        Assertions.assertEquals("Avocado", hero.getWeakness());
        Assertions.assertEquals(10, hero.getAge());
    }

    @Test
    public void Hero_idVariableAssignable_int(){
        Hero hero = new Hero("Kadima", "Teleporting", "Avocado", 10);

        hero.setHeroId(1);
        Assertions.assertEquals(1, hero.getHeroId());
    }

    @Test
    public void Hero_getCreatedHeroes_sizeEquals2_Hero(){
        Hero hero = new Hero("Kadima", "Teleporting", "Avocado", 10);
        Hero hero1 = new Hero("Samuel", "Telepathy", "Chapati", 101);
        Assertions.assertEquals(2, Hero.getCreatedHeroes().size());

    }

    @Test
    public void Hero_getHeroId_heroInstantiateWithAnID_1() throws Exception{
        Hero.clearCreatedHeroes();
        Hero hero = new Hero("Kadima", "Teleporting", "Avocado", 10);
        Assertions.assertEquals(1, hero.getHeroId());
    }






}
