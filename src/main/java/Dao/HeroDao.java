package Dao;

import modules.Hero;

import java.util.ArrayList;

public interface HeroDao {
    ArrayList<Hero> getCreatedHeroes();
    void add(Hero hero);
}
