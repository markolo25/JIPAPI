package com.markm.jipapi;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author markl
 */
public class Jipapi {

    OkHttpClient client = new OkHttpClient();

    public Jipapi() {

    }

    public String Request(String ip) throws IOException {
        Request request = new Request.Builder()
                .url("http://ip-api.com/json/" + ip)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
