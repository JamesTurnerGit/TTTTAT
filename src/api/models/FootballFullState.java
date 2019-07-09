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

    public FootballFullState(){}
    public FootballFullState( String homeTeam, String awayTeam, Boolean finished, int gameTimeInSeconds, Goal[] goals, String period, String startDateTime, boolean started, Team[] teams){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.finished = finished;
        this.gameTimeInSeconds = gameTimeInSeconds;
        this.goals = goals;
        this.period = period;
        this.startDateTime = startDateTime;
        this.started = started;
        this.teams = teams;
    }
}
