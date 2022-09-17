package com.company;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String>songs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recyclerView = findViewById(R.id.recycler_view);
        songs = new ArrayList<>();
        songs.add("Back in Black");
        songs.add("Hells Bells");
        songs.add("Thunderstruck");
        songs.add("It`s My life");
        songs.add("Listen to your Heart");
        songs.add("The look");
        songs.add("Spending My Time");
        songs.add("It must Have Been Love");
        songs.add("Feel");
        songs.add("Supreme");
        songs.add("Don`t cry");
        songs.add("Sweet Child O`Mine");
        songs.add("Supreme");
        Log.e("ray",songs.toString());
        SongsAdapter adapter = new SongsAdapter();
        adapter.setSongList(songs);
        recyclerView.setAdapter(adapter);
    }
}