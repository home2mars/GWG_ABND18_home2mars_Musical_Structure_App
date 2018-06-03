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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the top_albums category
        TextView top_albums = (TextView) findViewById(R.id.top_albums);

        // Set a click listener on that View
        top_albums.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the top_albums category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TopAlbumsActivity}
                Intent topAlbumsIntent = new Intent(MainActivity.this, TopAlbumsActivity.class);

                // Start the new activity
                startActivity(topAlbumsIntent);
            }
        });


        // Find the View that shows the top_artists category
        TextView top_artists = (TextView) findViewById(R.id.top_artists);

        // Set a click listener on that View
        top_artists.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the top_artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TopArtistsActivity}
                Intent topArtistsIntent = new Intent(MainActivity.this, TopArtistsActivity.class);

                // Start the new activity
                startActivity(topArtistsIntent);
            }
        });


        // Find the View that shows the top_songs category
        TextView top_songs = (TextView) findViewById(R.id.top_songs);

        // Set a click listener on that View
        top_songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the top_songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TopSongsActivity}
                Intent topSongsIntent = new Intent(MainActivity.this, TopSongsActivity.class);

                // Start the new activity
                startActivity(topSongsIntent);
            }
        });

    }
}
