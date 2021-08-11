package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquadTest {



    @Test
    public void Squad_SquadCorrectlyCreated(){
        Squad squad = new Squad("Kings",  "Save The Nation");

        Assertions.assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void Squad_variablesAssignable(){
        Squad squad = new Squad("Kings",  "Save The Nation");
        Assertions.assertEquals("Kings", squad.getSquadName());
        Assertions.assertEquals("Save The Nation", squad.getCause());
    }
    @Test
    public void Squad_squadIdAssignable(){
        Squad squad2 = new Squad("Queens",  "Save Trees");
        squad2.setSquadId(2);
        Assertions.assertEquals(2, squad2.getSquadId());
    }
}
