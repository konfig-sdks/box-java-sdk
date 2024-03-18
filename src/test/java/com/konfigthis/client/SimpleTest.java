package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.box.com/2.0";
        
        // Configure OAuth2 access token for authorization: OAuth2Security
        configuration.accessToken = "YOUR ACCESS TOKEN";
        Box client = new Box(configuration);
        assertNotNull(client);
    }
}
