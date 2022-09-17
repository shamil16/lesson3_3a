package com.company;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SongsViewHolder extends RecyclerView.ViewHolder {
    private TextView songs;
    public SongsViewHolder(@NonNull View itemView) {
        super(itemView);
        songs=itemView.findViewById(R.id.hello);
    }
    public void bind(String songName){
        songs.setText(songName);
    }
}
