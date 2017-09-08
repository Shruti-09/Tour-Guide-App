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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.data_list, container, false);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_food));
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_dish));
        dataWord.add(new DataWord(getString(R.string.rn1), getString(R.string.rloc1), R.drawable.restaurant_food));

        DataAdapter adapter = new DataAdapter(getActivity(), dataWord, R.color.color_restaurant);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
