package api.models;

public class Goal {
    public int clockTime;
    public boolean confirmed;
    public int id;
    public boolean ownGoal;
    public boolean penalty;
    public String period;
    public int playerId;
    public String teamId;

    public Goal(){}
    public Goal(int clockTime,boolean confirmed,int id, boolean ownGoal,boolean penalty,String period,int playerId,String teamId){
        this.clockTime = clockTime;
        this.confirmed = confirmed;
        this.id =id;
        this.ownGoal = ownGoal;
        this.penalty = penalty;
        this.period = period;
        this.playerId = playerId;
        this.teamId =teamId;
    }
}
