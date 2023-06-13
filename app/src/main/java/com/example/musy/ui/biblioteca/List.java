package com.example.musy.ui.biblioteca;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.ObjectsCompat;

import com.example.musy.R;

import java.util.ArrayList;

public class List extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_biblioteca_mock);

        ListView listView = findViewById(R.id.listView);
        //createdata
        ArrayList<Playlist> arrayList = new ArrayList<>();

        arrayList.add(new Playlist(R.drawable.chora, "Nguyen Thi A", 0, new ArrayList<String>()));
        arrayList.add(new Playlist(R.drawable.chora, "Nguyen Thi B", 0, new ArrayList<String>()));
        arrayList.add(new Playlist(R.drawable.diluvio, "Nguyen Thi C", 0, new ArrayList<String>()));
        arrayList.add(new Playlist(R.drawable.chora, "Nguyen Thi D", 0, new ArrayList<String>()));
        arrayList.add(new Playlist(R.drawable.chora, "Nguyen Thi E", 0, new ArrayList<String>()));

        PlaylistAdapter PlaylistAdapter = new PlaylistAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(PlaylistAdapter);
    }
}
