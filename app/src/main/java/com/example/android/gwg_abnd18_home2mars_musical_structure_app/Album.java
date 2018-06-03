package com.example.android.gwg_abnd18_home2mars_musical_structure_app;


/**
 * {@link Album} represents an album object that the user might want to browse.
 * It contains an album name, artist name, release year, number of songs.
 */

public class Album {

    /** The name of the album */
    private String mAlbumName;

    /** The name of the artist */
    private String mArtistName;

    /** The album release year */
    private int mReleaseYear;

    /** The number of songs inside the album */
    private int mNumOfSongs;

    /**
     * Create a new Album object.
     *
     * @param albumName is name of the album
     * @param artistName is name of the album's singer
     * @param releaseYear is year when the album was released
     * @param numOfSongs is the number of songs in the album
     */
    public Album(String albumName, String artistName, int releaseYear, int numOfSongs) {
        mAlbumName = albumName;
        mArtistName = artistName;
        mReleaseYear = releaseYear;
        mNumOfSongs = numOfSongs;
    }

    /**
     * Get the name of the album.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the name of the artist.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the year when the album was released.
     */
    public int getReleaseYear() {
        return mReleaseYear;
    }

    /**
     * Get the number of songs in the album.
     */
    public int getNumOfSongs() {
        return mNumOfSongs;
    }

}
