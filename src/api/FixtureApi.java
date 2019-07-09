package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import api.models.Fixture;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class FixtureApi {

    String hostUrl = "localhost";
    int port = 3000;

    private HttpURLConnection getClient(String path, String method) throws IOException {
        URL url = new URL("http", this.hostUrl, this.port, path);
        HttpURLConnection client = (HttpURLConnection) url.openConnection();
        client.setRequestMethod(method);
        if(method == "POST"){
            client.setDoOutput(true);
            client.setRequestProperty("Content-Type", "application/json; utf-8");
        }
        return client;
    }

    private Fixture[] deserializeFixtures(HttpURLConnection client) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            sb.append(output);
        }

        Fixture[] result = new ObjectMapper().readValue(sb.toString(), Fixture[].class);

        return result;
    }

    private void validateResponse(HttpURLConnection client) throws IOException {
        int responseCode = client.getResponseCode();
        if(responseCode != 200){
            throw new IOException("invalid response code from api- " + responseCode + ":" + client.getResponseMessage());
        }
    }

    public Fixture[] getAllFixtures() throws IOException {
        HttpURLConnection client = getClient("/fixtures","GET");
        validateResponse(client);
        return deserializeFixtures(client);
    }

    public void storeFixture(Fixture fixture) throws IOException {
        String json = new ObjectMapper().writeValueAsString(fixture);
        HttpURLConnection client = getClient("/fixture","POST");
        OutputStream os = client.getOutputStream();
        byte[] input = json.getBytes("utf-8");
        os.write(input, 0, input.length);
        validateResponse(client);

        //TODO: would now do a waituntil with retries until fixture appears in getAllFixtures,
    }
}