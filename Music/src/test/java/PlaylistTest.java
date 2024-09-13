import org.example.music.Playlist;
import org.example.music.Song;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PlaylistTest {
    private Playlist playlist;

    @BeforeEach
    public void setUp() {
        playlist = new Playlist();
    }

    @AfterEach
    public void tearDown() {
        playlist = null;
    }

    @Test
    public void testPlaylistCreation() {
        assertNull(playlist, "Created playlist should be empty.");
    }

    @Test
    public void testAddSongPlaylistSize() {
        Song song = new Song("test", "test", 1);
        playlist.add(song);
        assertEquals(1, playlist.size(), "Playlist size after adding one song should return 1.");
    }

    @Test
    public void testHasDuplicateSongObject() {
        Song song = new Song("test", "test", 1);
        playlist.add(song);
        assertEquals(playlist.get(0), song, "The same song object should be in the playlist.");
    }

}
