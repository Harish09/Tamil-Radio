package harish.tamilradio;

/**
 * Created by Harish on 07/12/16.
 */

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by echessa on 11/26/16.
 */

public interface SCService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
    Call<List<Track>> getRecentTracks(@Query("user_id") String date);
}
