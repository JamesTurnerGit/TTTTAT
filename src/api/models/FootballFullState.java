package api.models;

public class FootballFullState {
    public String homeTeam;
    public String awayTeam;
    public Boolean finished;
    public int gameTimeInSeconds;
    public Goal[] goals;
    public String period;
    public String[] possibles;
    public String[] corners;
    public String[] redCards;
    public String[] yellowCards;
    public String startDateTime;
    public boolean started;
    public Team[] teams;
}
