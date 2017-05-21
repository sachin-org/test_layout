package com.example.sowmya.testmusic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sowmya on 21-05-2017.
 */

public class MilestoneFragment extends Fragment {


    // Required empty public constructor
    private List<Songdetails_pojo> movieList = new ArrayList<>();
    private int anInt[]=new int[]{R.drawable.adele,R.drawable.chanelwestcoast,R.drawable.taylormomsen,R.drawable.demilovato,
            R.drawable.mileycyrus,R.drawable.taylormomsen};
    private RecyclerView recyclerView;


    private Milestone_adapter mAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.video_fragment, container, false);


        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

        mAdapter = new Milestone_adapter(movieList,anInt);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();

        return  view;
    }


    private void prepareMovieData() {
        movieList.clear();
        Songdetails_pojo songdetails_pojo = new Songdetails_pojo("Set Fire to the Rain. Adele ", "18 HOURS AGO",
                "Adele is an English singer and songwriter who rose to fame owing to her distinctive voice");
        movieList.add(songdetails_pojo);

        songdetails_pojo = new Songdetails_pojo("Ridiculousness .Chanel West Coast", "20  HOURS AGO", "Chanel West Coast is a popular American entertainer, rapper, singer and actress");
        movieList.add(songdetails_pojo);

        songdetails_pojo = new Songdetails_pojo("Another Cinderella Story .Selena Gomez", "21 HOURS AGO",
                "Selena Gomez is a highly popular actor-singer who became famous after starring in several ‘Disney’ television series and films.\n" );
        movieList.add(songdetails_pojo);

        songdetails_pojo = new Songdetails_pojo("Demi Lovato", "22 HOURS AGO",
                "Demi Lovato is a popular contemporary singer and actress of American descent known for her albums ‘Don’t Forget’ and ‘Here We Go Again\n" );
        movieList.add(songdetails_pojo);

        songdetails_pojo = new Songdetails_pojo("Miley Cyrus", "23 HOURS AGO", "Miley Cyrus is an American pop sensation and actress\n");
        movieList.add(songdetails_pojo);

        songdetails_pojo = new Songdetails_pojo("Taylor Momsen", "24 HOURS AGO", "Taylor Momsen is an American singer, songwriter, and actress");
        movieList.add(songdetails_pojo);



        mAdapter.notifyDataSetChanged();
    }
}
