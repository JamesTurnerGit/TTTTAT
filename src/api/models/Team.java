package api.models;

public class Team {
    public String association;
    public String name;
    public String teamId;

    public Team(){}
    public Team(String association, String name, String teamId){
        this.association = association;
        this.name = name;
        this.teamId = teamId;
    }
}
