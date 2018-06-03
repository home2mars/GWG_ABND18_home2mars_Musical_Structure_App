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

public class TopAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of albums
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Album 1", "Artist 1", 2010, 8));
        albums.add(new Album("Album 2", "Artist 2", 2008, 10));
        albums.add(new Album("Album 3", "Artist 3", 2018, 5));
        albums.add(new Album("Album 4", "Artist 4", 2014, 11));
        albums.add(new Album("Album 5", "Artist 5", 2011, 8));
        albums.add(new Album("Album 6", "Artist 1", 2016, 12));

        // Create an {@link AlbumAdapter}, whose data source is a list of {@link Album}s. The
        // adapter knows how to create list items for each item in the list.
        AlbumAdapter adapter = new AlbumAdapter(this, albums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AlbumAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Album} in the list.
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
