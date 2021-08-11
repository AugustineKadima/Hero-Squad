package modules;

import java.util.ArrayList;

public class Squad {

    private String squadName;
    private ArrayList<Squad> squadMembers = new ArrayList<>();
    private String cause;
    private int squadId;

    public Squad(String squadName,  String cause ){
        this.squadName = squadName;
        this.cause = cause;
        squadMembers.add(this);
    }
    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }


    public ArrayList<Squad> getSquadMembers() {
        return squadMembers;
    }

    public void setSquadMembers(ArrayList<Squad> squadMembers) {
        this.squadMembers = squadMembers;
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
