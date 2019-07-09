package api;

import static org.junit.jupiter.api.Assertions.*;

import api.models.Fixture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class FixtureApiTests {

    FixtureApi api;

    @BeforeEach
    void init(){
        this.api = new FixtureApi();//overload this contructor to point tests elsewhere, would normally take from an ENV
    }

    @Test
    void allFixturesCorrectNumbers() throws IOException {
        Fixture[] fixtures = api.getAllFixtures();
        assertEquals(3,fixtures.length,"wrong number of fixtures found");
    }

    @Test
    void allFixturesHaveId() throws IOException {
        Fixture[] fixtures = api.getAllFixtures();
        for (Fixture fixture : fixtures) {
            if(fixture.fixtureId == null ){
                fail("at least one fixture has no id");
            }
        }
    }
}


