package com.example.android.project6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.project6.R;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.hospitaln1), getString(R.string.hospitalloc1), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospitaln2), getString(R.string.hospitalloc2), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospitaln3), getString(R.string.hospitalloc3), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospitaln4), getString(R.string.hospitalloc4), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospitaln5), getString(R.string.hospitalloc5), R.drawable.hospital));
        dataWord.add(new DataWord(getString(R.string.hospitaln6), getString(R.string.hospitalloc6), R.drawable.hospital));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_hospitals);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
