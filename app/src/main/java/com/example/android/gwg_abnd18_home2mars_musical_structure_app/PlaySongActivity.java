package com.example.android.gwg_abnd18_home2mars_musical_structure_app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlaySongActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        // Populate the Text Views by retrieving data from previous screen
        context = this;
        Intent intent = this.getIntent();
        if (intent != null) {
            TextView songName = (TextView) findViewById(R.id.song_name_text_view);
            TextView artistName = (TextView) findViewById(R.id.artist_name_text_view);
            TextView albumName = (TextView) findViewById(R.id.album_name_text_view);

            songName.setText(intent.getStringExtra("SongName"));
            artistName.setText("By: " + intent.getStringExtra("ArtistName"));
            albumName.setText("Album: " + intent.getStringExtra("AlbumName"));
        }

        // Toggle the Play/Pause Button
        // Set default text
        final Button playPauseButton = (Button) findViewById(R.id.play_pause_button);
        final String playString = getString(R.string.play_text);
        final String pauseString = getString(R.string.pause_text);
        playPauseButton.setText(pauseString);

        // Start processing click event
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toggle the text on the playPauseButton
                if (playPauseButton.getText() == pauseString) {
                    playPauseButton.setText(playString);
                }
                else {
                    playPauseButton.setText(pauseString);
                }
            }
        });

        // Set an onClickListener to return the TopSongs Activity
        Button backButton = (Button) findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context onClickContext = v.getContext();
                Intent topSongActivityIntent = new Intent(new Intent(onClickContext, TopSongsActivity.class));
                onClickContext.startActivity(topSongActivityIntent);

            }
        });

    }
}


