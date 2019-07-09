package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import api.models.Fixture;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FixtureApi {

    String hostUrl = "localhost";
    int port = 3000;

    private HttpURLConnection getClient(String path, String method) throws IOException {
        URL url = new URL("http", this.hostUrl, this.port, path);
        HttpURLConnection client = (HttpURLConnection) url.openConnection();
        client.setRequestMethod(method);
        return client;
    }

    private Fixture[] deserializeFixtures(HttpURLConnection client) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            sb.append(output);
        }

        ObjectMapper mapper = new ObjectMapper();
        Fixture[] result = new ObjectMapper().readValue(sb.toString(), Fixture[].class);

        return result;
    }

    private void validateResponse(HttpURLConnection client) throws IOException {
        int responseCode = client.getResponseCode();
        if(responseCode != 200){
            throw new IOException("invalid response code from api: " + responseCode );
        }
    }

    public Fixture[] getAllFixtures() throws IOException {
        HttpURLConnection client = getClient("/fixtures","GET");
        validateResponse(client);
        return deserializeFixtures(client);
    }
}