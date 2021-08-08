package modules;

public class Squad {

    private String squadName;
    private String[] squadMembers = new String[5];
    private String cause;
    private int squadId;

    void Squad(String squadName, String[] squadMembers, String cause ){
        this.squadName = squadName;
        this.cause = cause;
        this.squadMembers = squadMembers;
    }
    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }


    public String[] getSquadMembers() {
        return squadMembers;
    }

    public void setSquadMembers(String[] squadMembers) {
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
