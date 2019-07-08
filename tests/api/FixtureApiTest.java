package api;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import api.FixtureApi;
import api.Fixture;

import java.io.IOException;

class FixtureApiTest {

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
    void allFixturesValid() {
        fail();
    }
}

