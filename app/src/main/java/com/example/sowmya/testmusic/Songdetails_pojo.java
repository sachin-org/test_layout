package com.example.sowmya.testmusic;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sowmya on 21-05-2017.
 */

public class Songdetails_pojo implements Parcelable {


    String songname;
    String posting_time;
    String song_details;

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getPosting_time() {
        return posting_time;
    }

    public void setPosting_time(String posting_time) {
        this.posting_time = posting_time;
    }

    public String getSong_details() {
        return song_details;
    }

    public void setSong_details(String song_details) {
        this.song_details = song_details;
    }

    public Songdetails_pojo(String songname, String posting_time, String song_details) {
        this.songname = songname;
        this.posting_time = posting_time;
        this.song_details = song_details;
    }

    protected Songdetails_pojo(Parcel in) {
        songname = in.readString();
        posting_time = in.readString();
        song_details = in.readString();
    }

    public static final Creator<Songdetails_pojo> CREATOR = new Creator<Songdetails_pojo>() {
        @Override
        public Songdetails_pojo createFromParcel(Parcel in) {
            return new Songdetails_pojo(in);
        }

        @Override
        public Songdetails_pojo[] newArray(int size) {
            return new Songdetails_pojo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(songname);
        dest.writeString(posting_time);
        dest.writeString(song_details);
    }
}
