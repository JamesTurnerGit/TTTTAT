package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;


public class FixtureApi {

    String hostUrl = "localhost";
    int port = 3000;

    private HttpURLConnection GetClient(String path, String method) throws IOException {
        URL url = new URL("http", this.hostUrl, this.port, path);
        HttpURLConnection client = (HttpURLConnection) url.openConnection();
        client.setRequestMethod(method);
        return client;
    }
}