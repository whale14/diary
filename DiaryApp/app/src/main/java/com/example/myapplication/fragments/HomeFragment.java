package com.example.myapplication.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.FeedItem;
import com.example.myapplication.FeedRecyclerAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.item_feed, container, false);

        RecyclerView mFeedView = rootView.findViewById(R.id.feed_view);
        RecyclerView.LayoutManager mFeedManager = new GridLayoutManager(getActivity(), 2);
        mFeedView.setLayoutManager(mFeedManager);

        List<FeedItem> feedItemList = new ArrayList<>();
        for (int i = 0; i <10; i++) {
            feedItemList.add(new FeedItem(i+"번째"));
        }
        FeedRecyclerAdapter adapter = new FeedRecyclerAdapter(feedItemList);
        mFeedView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return rootView;
    }

}
