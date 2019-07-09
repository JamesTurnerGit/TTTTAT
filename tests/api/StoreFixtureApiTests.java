package api;

import api.models.Fixture;
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
}


