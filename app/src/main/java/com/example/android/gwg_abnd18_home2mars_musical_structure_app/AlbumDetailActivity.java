package com.example.android.gwg_abnd18_home2mars_musical_structure_app;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlbumDetailActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        // Populate the Text Views by retrieving data from previous screen
        context = this;
        Intent intent = this.getIntent();
        if (intent != null) {
            TextView albumName = (TextView) findViewById(R.id.album_name_text_view);
            TextView artistName = (TextView) findViewById(R.id.artist_name_text_view);
            TextView releaseYear = (TextView) findViewById(R.id.year_text_view);
            TextView numOfSongs = (TextView) findViewById(R.id.num_song_text_view);

            albumName.setText(intent.getStringExtra("AlbumName"));
            artistName.setText("By: " + intent.getStringExtra("ArtistName"));
            releaseYear.setText("Release: " + intent.getStringExtra("ReleaseYear"));
            numOfSongs.setText("Number of Songs: " + intent.getStringExtra("NumOfSongs"));
        }


        // Set an onClickListener to return the TopAlbums Activity
        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context onClickContext = v.getContext();
                Intent topAlbumActivityIntent = new Intent(new Intent(onClickContext, TopAlbumsActivity.class));
                onClickContext.startActivity(topAlbumActivityIntent);

            }
        });


    }
}
