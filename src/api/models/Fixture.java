package api.models;

public class Fixture {
    public Integer fixtureId;
    public FixtureStatus fixtureStatus;
    public FootballFullState footballFullState;

    public Fixture(){}
    public Fixture(Integer fixtureId, FixtureStatus fixtureStatus, FootballFullState footballFullState){
        this.fixtureId = fixtureId;
        this.fixtureStatus = fixtureStatus;
        this.footballFullState = footballFullState;
    }
}

