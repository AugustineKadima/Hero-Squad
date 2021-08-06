import java.util.ArrayList;

public class Hero {

    private String heroName;
    private String superPower;
    private String weakness;
    private int age;


    void Hero(String heroName, String superPower, String weakness, int age){
        this.heroName = heroName;
        this.superPower = superPower;
        this.weakness = weakness;
        this.age = age;
    }

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


}
