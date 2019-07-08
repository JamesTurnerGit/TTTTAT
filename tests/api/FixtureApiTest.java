package api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import api.FixtureApi;
import api.Fixture;

class FixtureApiTest {

    FixtureApi api;

    @BeforeEach
    void init(){
        this.api = new FixtureApi();
    }

    @Test
    void allFixturesCorrectNumbers() {
        Fixture[] fixtures = api.getAllFixtures();
    }

    @Test
    void allFixturesValid() {
        fail();
    }
}


