package com.example.android.project6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.project6.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hoteln1), getString(R.string.hotelloc1), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hoteln2), getString(R.string.hotelloc2), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hoteln3), getString(R.string.hotelloc3), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hoteln4), getString(R.string.hotelloc4), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hoteln5), getString(R.string.hotelloc5), R.drawable.hotel));
        dataWord.add(new DataWord(getString(R.string.hoteln6), getString(R.string.hotelloc6), R.drawable.hotel));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_hotel);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
