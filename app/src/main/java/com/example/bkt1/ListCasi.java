package com.example.bkt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCasi extends AppCompatActivity {

    private ListView lvCasi;
    private ArrayList<Casi> arraycasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_casi);
        Anhxa();
    }
    private void Anhxa() {
        lvCasi = (ListView) findViewById(R.id.listview);
        arraycasi = new ArrayList<>();
        arraycasi.add(new Casi("Our Song", R.drawable.itunes));
    }
}