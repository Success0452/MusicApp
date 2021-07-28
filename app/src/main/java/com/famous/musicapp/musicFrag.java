package com.famous.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.famous.musicapp.adapters.MusicAdapter;

public class musicFrag extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.grid_list, container, false);
        GridView gridView = view.findViewById(R.id.grid_view);


        MusicAdapter musicAdapter = new MusicAdapter(getActivity(), MainActivity.musicLists);
        gridView.setAdapter(musicAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getContext(), PlayingNowActivity.class);
                intent.putExtra(MainActivity.Position, position);
                startActivity(intent);
            }
        });
        return view;
    }
}
