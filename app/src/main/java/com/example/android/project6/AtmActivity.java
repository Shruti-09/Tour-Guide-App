package com.example.android.project6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.android.project6.R;

import java.util.ArrayList;

public class AtmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_list);

        ArrayList<DataWord> dataWord = new ArrayList<DataWord>();
        dataWord.add(new DataWord(getString(R.string.ant1), getString(R.string.aloc1) ,R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.ant2), getString(R.string.aloc2),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.ant3), getString(R.string.aloc3),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.ant4), getString(R.string.aloc4),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.ant5), getString(R.string.aloc5),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.ant6), getString(R.string.aloc6),R.drawable.atm_machine));
        dataWord.add(new DataWord(getString(R.string.ant7), getString(R.string.aloc7),R.drawable.atm_machine));

        DataAdapter adapter = new DataAdapter(this, dataWord, R.color.color_atm);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
