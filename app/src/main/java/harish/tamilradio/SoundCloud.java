package harish.tamilradio;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Harish on 07/12/16.
 */

public class SoundCloud {


    private static final Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl(Config.API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private static final SCService SERVICE = RETROFIT.create(SCService.class);

    public static SCService getService() {
        return SERVICE;
    }
}
