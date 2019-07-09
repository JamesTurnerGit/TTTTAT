package api;

import api.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StoreFixtureApiTests {
    FixtureApi api;

    @BeforeEach
    void init(){
        this.api = new FixtureApi();//overload this contructor to point tests elsewhere, would normally take from an ENV
    }

    @Test
    void CanStoreAFixture() throws IOException {
        Goal[] goals= new Goal[1];
        goals[0] = new Goal(1400,true,1,false,false,"FIRST_HALF",6999, "1");;

        Team[] teams= new Team[2];
        teams[0] =  new Team ( "HOME", "chipmunks","HOME");
        teams[1] = new Team ( "AWAY", "chippettes","AWAY");

        FootballFullState footballFullState = new FootballFullState("chipmunks","chippettes",false, 2000,goals,"FIRST_HALF","1995-03-20T10:49:38.655Z",true,teams);

        FixtureStatus fixtureStatus = new FixtureStatus(true,false);

        Fixture fixture = new Fixture(1,fixtureStatus,footballFullState);

        api.storeFixture(fixture);

        Fixture remoteFixture = api.getAllFixtures()[3]; // would find it using a array search function if more time

        System.out.println(remoteFixture.footballFullState.awayTeam);
        assertEquals(fixture.fixtureId, remoteFixture.fixtureId);
        //does junit have a deep-compare?
    }
}


