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
 * {@link AlbumAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Album} objects.
 */
public class AlbumAdapter extends ArrayAdapter<Album> {

    /**
     * Create a new {@link AlbumAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param albums is the list of {@link Album}s to be displayed.
     */

    public AlbumAdapter(Context context, ArrayList<Album> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list_item, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        final Album currentAlbum = getItem(position);

        // Find the TextView in the album_list_item.xml layout with the ID album_name_text_view.
        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name_text_view);
        albumNameTextView.setText(currentAlbum.getAlbumName());

        // Find the TextView in the album_list_item.xml layout with the ID artist_name_text_view.
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText("By: " + currentAlbum.getArtistName());

        // Find the TextView in the album_list_item.xml layout with the ID year_text_view.
        TextView yearTextView = (TextView) listItemView.findViewById(R.id.year_text_view);
        yearTextView.setText("Release: " + String.valueOf(currentAlbum.getReleaseYear()));

        // Find the TextView in the album_list_item.xml layout with the ID num_song_text_view.
        TextView numSongsTextView = (TextView) listItemView.findViewById(R.id.num_song_text_view);
        numSongsTextView.setText("Number of Songs: " + String.valueOf(currentAlbum.getNumOfSongs()));

        // Find the Button that will show album detail
        Button detailButton = (Button) listItemView.findViewById(R.id.detail_button);

        // Set a click listener on that Button
        detailButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playButton is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumDetailActivity}
                // Need to pass in the values to the activity and start it
                // the activity and start it
                Context onClickContext = getContext();
                Intent playIntent = new Intent(new Intent(onClickContext, AlbumDetailActivity.class));
                playIntent.putExtra("ArtistName", currentAlbum.getArtistName());
                playIntent.putExtra("AlbumName", currentAlbum.getAlbumName());
                playIntent.putExtra("ReleaseYear", String.valueOf(currentAlbum.getReleaseYear()));
                playIntent.putExtra("NumOfSongs", String.valueOf(currentAlbum.getNumOfSongs()));

                onClickContext.startActivity(playIntent);

            }
        });


        // Return the whole list item layout (containing 4 TextViews and 1 Button)
        // so that it can be shown in the ListView.
        return listItemView;
    }
}