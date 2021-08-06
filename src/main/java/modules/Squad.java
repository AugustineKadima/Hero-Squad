package modules;

public class Squad {

    private String squadName;
    private String[] squadMembers = new String[5];
    private String cause;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
