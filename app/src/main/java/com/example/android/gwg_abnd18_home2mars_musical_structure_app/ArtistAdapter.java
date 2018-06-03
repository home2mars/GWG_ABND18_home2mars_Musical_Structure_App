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
 * {@link ArtistAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Artist} objects.
 */

public class ArtistAdapter extends ArrayAdapter<Artist> {

    /**
     * Create a new {@link ArtistAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param artists is the list of {@link Artist}s to be displayed.
     */

    public ArtistAdapter(Context context, ArrayList<Artist> artists) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.artist_list_item, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        final Artist currentArtist = getItem(position);

        // Find the TextView in the artist_list_item.xml layout with the ID artist_name_text_view.
        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name_text_view);
        artistNameTextView.setText(currentArtist.getArtistName());

        // Find the TextView in the artist_list_item.xml layout with the ID age_text_view.
        TextView ageTextView = (TextView) listItemView.findViewById(R.id.age_text_view);
        ageTextView.setText("Age: " + String.valueOf(currentArtist.getArtistAge()));

        // Find the TextView in the artist_list_item.xml layout with the ID hometown_text_view.
        TextView artistHometownTextView = (TextView) listItemView.findViewById(R.id.hometown_text_view);
        artistHometownTextView.setText(currentArtist.getArtistTown());

        // Find the TextView in the artist_list_item.xml layout with the ID country_text_view.
        TextView artistCountryTextView = (TextView) listItemView.findViewById(R.id.country_text_view);
        artistCountryTextView.setText(currentArtist.getArtistCountry());


        // Return the whole list item layout (containing 4 TextViews)o
        // so that it can be shown in the ListView.
        return listItemView;
    }
}
