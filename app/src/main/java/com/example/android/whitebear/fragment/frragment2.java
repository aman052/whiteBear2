package com.example.android.whitebear.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.whitebear.Adapters.Events_adapter;
import com.example.android.whitebear.Models.EventsModel;
import com.example.android.whitebear.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dellpc on 3/17/2018.
 */

public class frragment2 extends Fragment {

    @Nullable
    private RecyclerView scheduleRecycle;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.layout_fragment2,container,false);
        scheduleRecycle=view.findViewById(R.id.schedule_recycle);
        scheduleRecycle.setLayoutManager(new LinearLayoutManager(getContext()));
        List<EventsModel> list=new ArrayList<>();
        list.add(new EventsModel("AB1234","Abhishek Bharti","ma_piyu","Grand Marriage","Bokaro Rectangle Maidan","Pura Bokaro","Litti Chokha"));
        list.add(new EventsModel("SU225","Sumant Kumar","ma_sets","Honeymoon","Bhagalpur","Couple","Lollipop"));
        Events_adapter adapter=new Events_adapter(getContext(),list);
        scheduleRecycle.setAdapter(adapter);


        return view;
    }
}
