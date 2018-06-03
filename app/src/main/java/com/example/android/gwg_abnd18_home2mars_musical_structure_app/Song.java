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

/**
 * {@link Song} represents a song object that the user might want to play.
 * It contains a name, artist name, album name.
 */
public class Song {

    /** The name of the song */
    private String mSongName;

    /** The name of the album where the song is bundled */
    private String mAlbumName;

    /** The name of the artist who sang the song */
    private String mArtistName;

    /**
     * Create a new Song object.
     *
     * @param songName is name of the song
     * @param albumName is name of the song's album
     * @param artistName is name of the song's singer
     */
    public Song(String songName, String albumName, String artistName) {
        mSongName = songName;
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    /**
     * Get the name of the song.
     */
    public String getSongName() {
        return mSongName;
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

}
