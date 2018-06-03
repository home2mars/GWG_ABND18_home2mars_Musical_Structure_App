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
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class TopArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of artists
        ArrayList<Artist> artists = new ArrayList<Artist>();
        artists.add(new Artist("Artist 1", 20, "Hometown 1", "USA"));
        artists.add(new Artist("Artist 2", 31, "Hometown 2", "UK"));
        artists.add(new Artist("Artist 3", 28, "Hometown 3", "China"));
        artists.add(new Artist("Artist 4", 45, "Hometown 4", "Australia"));
        artists.add(new Artist("Artist 5", 39, "Hometown 5", "USA"));

        // Create an {@link ArtistAdapter}, whose data source is a list of {@link Artist}s. The
        // adapter knows how to create list items for each item in the list.
        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArtistAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Artist} in the list.
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
