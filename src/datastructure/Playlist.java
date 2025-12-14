package datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Playlist {

    // Use an ArrayList to store the media items
    private ArrayList<Media> mediaList;

    public Playlist() {
        // Initialize the list
        this.mediaList = new ArrayList<>();
    }

    public void addMedia(Media mediaItem) {
        // Add the item to the end of the list
        mediaList.add(mediaItem);
    }

    public void removeMedia(String mediaName) {
        // Loop through the list to find the media by name
        for (int i = 0; i < mediaList.size(); i++) {
            // If the titles match, remove it and stop looking
            if (mediaList.get(i).getTitle().equals(mediaName)) {
                mediaList.remove(i);
                return;
            }
        }
    }

    public void playNext() {
        // Check if the list is empty first
        if (mediaList.isEmpty()) {
            System.out.println("No media in playlist");
        } else {
            // Get the first item
            Media next = mediaList.get(0);
            System.out.println("Now playing.. " + next.getTitle());
            // Remove the item we just played
            mediaList.remove(0);
        }
    }

    public void showPlaylist() {
        // Print every item in the list
        for (Media m : mediaList) {
            System.out.println(m.toString());
        }
    }

    public int getSize() {
        // Return how many items are in the list
        return mediaList.size();
    }

    public boolean containsMedia(String mediaName) {
        // Check if any item in the list matches the name
        for (Media m : mediaList) {
            if (m.getTitle().equals(mediaName)) {
                return true;
            }
        }
        return false;
    }

    public void shufflePlaylist() {
        // Randomize the order of the list
        Collections.shuffle(mediaList);
    }

    public void showPlayCounts() {
        // Use a Map to count how many times each title appears
        Map<String, Integer> counts = new HashMap<>();

        for (Media m : mediaList) {
            String title = m.getTitle();
            // If it exists add 1 to count, otherwise start at 1
            counts.put(title, counts.getOrDefault(title, 0) + 1);
        }

        // Print the counts
        for (String key : counts.keySet()) {
            System.out.print("\"" + key + "\" => " + counts.get(key) + " ");
        }
        System.out.println(); // Print a new line at the end
    }
}