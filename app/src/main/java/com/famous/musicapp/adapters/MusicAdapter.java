package com.famous.musicapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.famous.musicapp.R;
import com.famous.musicapp.arrayList.MusicList;

import java.util.List;

public class MusicAdapter extends ArrayAdapter<MusicList> {
    public MusicAdapter(@NonNull Context context, @NonNull List<MusicList> objects) {
        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list, parent, false
            );
        }

            MusicList musicList = getItem(position);

        if (musicList != null){
            ImageView imageView = view.findViewById(R.id.img);
            imageView.setImageResource(musicList.getImg());

            TextView textViewArtistName = view.findViewById(R.id.artistName);
            textViewArtistName.setText(musicList.getMusicArtist());

            TextView textViewMusicName = view.findViewById(R.id.musicName);
            textViewMusicName.setText(musicList.getMusicName());

            return view;
        }
        return view;

        }

}
