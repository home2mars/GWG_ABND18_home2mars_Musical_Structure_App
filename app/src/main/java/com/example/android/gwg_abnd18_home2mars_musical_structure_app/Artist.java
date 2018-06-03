package com.example.android.gwg_abnd18_home2mars_musical_structure_app;

/**
 * {@link Artist} represents an rtist object that the user might want to view.
 * It contains artist name, age, hometown, country.
 */
public class Artist {

    /** The name of the artist */
    private String mArtistName;

    /** The artist age */
    private int mArtistAge;

    /** The hometown of the artist */
    private String mArtistTown;

    /** The country of the hometown */
    private String mArtistCountry;

    /**
     * Create a new Artist object.
     *
     * @param artistName is name of the artist
     * @param artistAge is artist age
     * @param artistTown is artist hometown
     * @param artistCountry is the country of the hometown
     */
    public Artist(String artistName, int artistAge, String artistTown, String artistCountry) {
        mArtistName = artistName;
        mArtistAge = artistAge;
        mArtistTown = artistTown;
        mArtistCountry = artistCountry;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get artist age.
     */
    public int getArtistAge() {
        return mArtistAge;
    }

    /**
     * Get the artist hometown.
     */
    public String getArtistTown() {
        return mArtistTown;
    }

    /**
     * Get tthe country of the hometown.
     */
    public String getArtistCountry() {
        return mArtistCountry;
    }

}

