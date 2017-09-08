package com.example.android.project6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import android.widget.ListView;

import java.util.ArrayList;

public class GardenNActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.gnt1), getString(R.string.gloc1), R.drawable.terrace));
        dataWord.add(new DataWord(getString(R.string.gnt2), getString(R.string.gloc2), R.drawable.japnese));
        dataWord.add(new DataWord(getString(R.string.gnt3), getString(R.string.gloc3), R.drawable.roseg));
        dataWord.add(new DataWord(getString(R.string.gnt4), getString(R.string.gloc4), R.drawable.rockg));
        dataWord.add(new DataWord(getString(R.string.gnt5), getString(R.string.gloc5), R.drawable.silence));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_garden);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
