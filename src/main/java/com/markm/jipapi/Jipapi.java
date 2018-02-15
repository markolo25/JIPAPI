package com.markm.jipapi;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.*;

/**
 *
 * @author markl
 */
public class Jipapi {

    OkHttpClient client = new OkHttpClient();

    public Jipapi() {

    }

    public IPLoc Request(String ip) throws IOException {
        Request request = new Request.Builder()
                .url("http://ip-api.com/json/" + ip)
                .build();

        try (Response response = client.newCall(request).execute()) {
            JSONObject obj = new JSONObject(response.body().string());

            return new IPLoc(obj.getString("as"),
                    obj.getString("city"),
                    obj.getString("country"),
                    obj.getString("countryCode"),
                    obj.getString("isp"),
                    obj.getDouble("lat"),
                    obj.getDouble("lon"),
                    obj.getString("org"),
                    obj.getString("query"),
                    obj.getString("region"),
                    obj.getString("regionName"),
                    obj.getString("status"),
                    obj.getString("timezone"),
                    obj.getString("zip"));
        }
    }
}
