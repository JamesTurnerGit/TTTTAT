package api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class FixtureApi {

    String hostUrl = "localhost";
    int port = 3000;

    private HttpURLConnection getClient(String path, String method) throws IOException {
        URL url = new URL("http", this.hostUrl, this.port, path);
        HttpURLConnection client = (HttpURLConnection) url.openConnection();
        client.setRequestMethod(method);
        return client;
    }

    public Fixture[] getAllFixtures()
    {
        Fixture[] result = new Fixture[0];
        return result;
    }
}