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
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Song 1", "Album 1", "Artist 1"));
        songs.add(new Song("Song 2", "Album 1", "Artist 1"));
        songs.add(new Song("Song 3", "Album 2", "Artist 2"));
        songs.add(new Song("Song 4", "Album 3", "Artist 3"));
        songs.add(new Song("Song 5", "Album 1", "Artist 1"));
        songs.add(new Song("Song 6", "Album 2", "Artist 2"));
        songs.add(new Song("Song 7", "Album 2", "Artist 2"));
        songs.add(new Song("Song 8", "Album 4", "Artist 4"));
        songs.add(new Song("Song 9", "Album 5", "Artist 5"));
        songs.add(new Song("Song 10", "Album 6", "Artist 1"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);


        // Set an onClickListener to return the Main Activity
        Button backButton = (Button) findViewById(R.id.back2main_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context onClickContext = v.getContext();
                Intent mainActivityIntent = new Intent(new Intent(onClickContext, MainActivity.class));
                onClickContext.startActivity(mainActivityIntent);
            }
        });

    }
}
