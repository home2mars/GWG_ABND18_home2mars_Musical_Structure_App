/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.gwg_abnd18_home2mars_musical_structure_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song>  {

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        final Song currentSong = getItem(position);

        // Find the TextView in the song_list_item.xml layout with the ID song_name_text_view.
        TextView songNameTextView = (TextView) listItemView.findViewById(R.id.song_name_text_view);
        songNameTextView.setText(currentSong.getSongName());

        // Find the TextView in the song_list_item.xml layout with the ID artist_name_text_view.
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText("By: " + currentSong.getArtistName());

        // Find the TextView in the song_list_item.xml layout with the ID album_name_text_view.
        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name_text_view);
        albumNameTextView.setText("Album: " + currentSong.getAlbumName());

        // Find the Button that will play the song
        Button playButton = (Button) listItemView.findViewById(R.id.play_song_button);

        // Set a click listener on that Button
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playButton is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlaySongActivity}
                // Need to pass in the values to the activity and start it
                // the activity and start it
                Context onClickContext = getContext();
                Intent playIntent = new Intent(new Intent(onClickContext, PlaySongActivity.class));
                playIntent.putExtra("SongName", currentSong.getSongName());
                playIntent.putExtra("ArtistName", currentSong.getArtistName());
                playIntent.putExtra("AlbumName", currentSong.getAlbumName());

                onClickContext.startActivity(playIntent);

            }
        });

        // Return the whole list item layout (containing 3 TextViews and 1 Button)
        // so that it can be shown in the ListView.
        return listItemView;
    }
}