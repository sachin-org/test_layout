package com.example.sowmya.testmusic;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sowmya on 21-05-2017.
 */

public class Milestone_adapter extends RecyclerView.Adapter<Milestone_adapter.MyViewHolder> {


    private List<Songdetails_pojo> songslist;
    int images[];

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, time, sometext;
        ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.vedio_item_songname);
            time = (TextView) view.findViewById(R.id.vedio_item_postedname);
            sometext = (TextView) view.findViewById(R.id.vedio_item_songtext);

        }
    }


    public Milestone_adapter(List<Songdetails_pojo> songslist, int images[]) {
        this.songslist = songslist;
        this.images=images;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.milestone_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        try {
            if (position<=images.length) {
                Songdetails_pojo song = songslist.get(position);
                holder.name.setText(song.getSongname());
                holder.time.setText(song.getPosting_time());
                holder.sometext.setText(song.getSong_details());
            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return songslist.size();
    }
}
