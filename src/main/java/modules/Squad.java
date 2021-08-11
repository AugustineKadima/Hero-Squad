package modules;

import java.util.ArrayList;

public class Squad {

    private String squadName;
    public static ArrayList<Squad> squads = new ArrayList<>();
    private String cause;
    private int squadId;

    public Squad(String squadName,  String cause ){
        this.squadName = squadName;
        this.cause = cause;
        squads.add(this);
    }
    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }


    public static ArrayList<Squad> getSquads() {
        return squads;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public int getSquadId() {
        return squadId;
    }

    public void setSquadId(int squadId) {
        this.squadId = squadId;
    }
}
