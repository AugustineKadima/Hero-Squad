package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquadTest {

    Squad squad = new Squad();

    @Test
    public void Squad_SquadCorrectlyCreated(){
        Assertions.assertEquals(true, squad instanceof Squad);
    }

    @Test
    public void Squad_variablesAssignable(){
        squad.Squad("Kings", new String[]{"Mike Tyson", "Kadima"}, "Save The Nation");
        Assertions.assertEquals("Kings", squad.getSquadName());
        Assertions.assertEquals("Mike Tyson", squad.getSquadMembers()[0]);
        Assertions.assertEquals("Save The Nation", squad.getCause());
    }
    @Test
    public void Squad_squadIdAssignable(){
        squad.setSquadId(2);
        Assertions.assertEquals(2, squad.getSquadId());
    }
}
