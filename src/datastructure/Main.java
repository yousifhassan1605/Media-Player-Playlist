package datastructure;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        // Create media objects using the class from Assignment 1
        Media m1 = new Media("Inception");
        m1.setDuration(Duration.ofMinutes(148));
        
        Media m2 = new Media("Interstellar");
        m2.setDuration(Duration.ofMinutes(169));
        
        Media m3 = new Media("The Dark Knight");
        m3.setDuration(Duration.ofMinutes(152));

        // Create the playlist instance
        Playlist myPlaylist = new Playlist();

        // Add media to the playlist
        myPlaylist.addMedia(m1);
        myPlaylist.addMedia(m2);
        myPlaylist.addMedia(m3);

        // Add m1 again to test duplicates
        myPlaylist.addMedia(m1); 
        
        System.out.println("Playlist after adding items:");
        myPlaylist.showPlaylist();

        // Check size
        System.out.println("Size: " + myPlaylist.getSize());

        // Remove Inception (removes the first one found)
        myPlaylist.removeMedia("Inception");
        
        System.out.println("\nPlaylist after removing Inception:");
        myPlaylist.showPlaylist();

        // Play the next item (removes Interstellar)
        System.out.println("\nPlaying Next:");
        myPlaylist.playNext();

        System.out.println("\nPlaylist after playing next:");
        myPlaylist.showPlaylist();

        // Check if list contains specific media
        System.out.println("\nDoes the playlist contain 'The Dark Knight'? " + myPlaylist.containsMedia("The Dark Knight"));

        // Add items back to test counting and shuffling
        myPlaylist.addMedia(m2);
        myPlaylist.addMedia(m3);
        myPlaylist.addMedia(m3);

        System.out.println("\nPlay Counts:");
        myPlaylist.showPlayCounts();

        System.out.println("\nShuffling Playlist:");
        myPlaylist.shufflePlaylist();
        myPlaylist.showPlaylist();
    }
}