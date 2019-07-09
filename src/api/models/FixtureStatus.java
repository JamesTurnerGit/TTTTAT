package api.models;

import api.FixtureApi;

public class FixtureStatus {
    public boolean displayed;
    public boolean suspended;

    public FixtureStatus(){}
    public FixtureStatus(boolean displayed,boolean suspended){
        this.displayed = displayed;
        this.suspended = suspended;
    }
}
