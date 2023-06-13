package com.example.musy.ui.biblioteca;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.musy.R;

import java.util.ArrayList;

public class PlaylistAdapter extends ArrayAdapter<Playlist> {
    private Context mContext;
    private int mResource;

    public PlaylistAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Playlist> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.image);
        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtDes = convertView.findViewById(R.id.txtDes);

        imageView.setImageResource(getItem(position).getImage());
        txtName.setText(getItem(position).getName());
        txtDes.setText(getItem(position).getDes(0));

        return convertView;
    }
}

