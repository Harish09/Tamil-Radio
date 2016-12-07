package harish.tamilradio;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Harish on 07/12/16.
 */

public class Track {


    @SerializedName("title")
    private String mTitle;

    @SerializedName("id")
    private int mID;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("artwork_url")
    private String mArtworkURL;


    public String getmTitle() {
        return mTitle;
    }

    public int getmID() {
        return mID;
    }

    public String getmStreamURL() {
        return mStreamURL;
    }

    public String getmArtworkURL() {
        return mArtworkURL;
    }


}
