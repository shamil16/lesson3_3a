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
        setContentView(R.layout.activity_main);
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
        songs.add("Silence");
        songs.add("Dream On");
        songs.add("How you Remind Me");
        songs.add("Rockstar");
        songs.add("sing");
        songs.add("Ticket to the moon");
        songs.add("Close eyes");
        songs.add("Live another day");
        songs.add("Lost Forever");
        songs.add("Out time");
        songs.add("METAMORPHOSIS");
        songs.add("Hotel California 2013");
        SongsAdapter adapter = new SongsAdapter();
        adapter.setSongList(songs);
        recyclerView.setAdapter(adapter);
    }
}