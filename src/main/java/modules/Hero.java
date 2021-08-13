package modules;

import org.sql2o.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hero {

    private String heroName;
    private String superPower;
    private String weakness;
    private int age;
    private int heroId;
    public static List<Hero> createdHeroes = new ArrayList<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age && heroId == hero.heroId && Objects.equals(heroName, hero.heroName) && Objects.equals(superPower, hero.superPower) && Objects.equals(weakness, hero.weakness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heroName, superPower, weakness, age, heroId);
    }

    public Hero(String heroName, String superPower, String weakness, int age){
        this.heroName = heroName;
        this.superPower = superPower;
        this.weakness = weakness;
        this.age = age;
        createdHeroes.add(this);
        this.heroId = createdHeroes.size();
    }

//    public void save() {
//        try(Connection con = DB.sql2o.open()) {
//            String sql = "INSERT INTO heroes (hero_name, super_power, weakness, age) VALUES (:hero_name, :super_power, :weakness, :age)";
//            con.createQuery(sql)
//                    .addParameter("hero_name", this.heroName)
//                    .addParameter("super_power", this.superPower)
//                    .addParameter("weakness", this.weakness)
//                    .addParameter("age", this.age)
//                    .executeUpdate();
//        }
//    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public static List<Hero> getCreatedHeroes() {
        return createdHeroes;
    }

    public static void clearCreatedHeroes(){
        createdHeroes.clear();
    }

    public static Hero findById(int id){
        return createdHeroes.get(id-1);
    }


}
