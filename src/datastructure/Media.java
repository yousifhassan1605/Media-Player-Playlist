package datastructure;

import java.time.Duration;
import java.util.*;

public class Media {
    // Attributes
    private String title;
    private String genre;
    private double rating;
    private Duration duration;

    // Data structure to hold all media items
    private static List<Media> allMedia = new ArrayList<>();

    // Constructor
    public Media(String title) {
        this.title = title;
        allMedia.add(this);
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public Duration getDuration() {
        return duration;
    }
    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    // Add and Remove Methods
    public static void addMedia(Media media) {
        allMedia.add(media);
    }

    public static void removeMedia(Media media) {
        allMedia.remove(media);
    }

    // Limit the size of the allMedia list
    public static void limitSize(int limit) {
        while (allMedia.size() > limit) {
            allMedia.remove(0);
        }
    }

    // Return an array of the top 5 rated media
    public static Media[] getTopFiveRated() {
        List<Media> sortedList = new ArrayList<>(allMedia);
        sortedList.sort((a, b) -> Double.compare(b.getRating(), a.getRating())); // descending order

        int size = Math.min(5, sortedList.size());
        Media[] topFive = new Media[size];
        for (int i = 0; i < size; i++) {
            topFive[i] = sortedList.get(i);
        }
        return topFive;
    }

    // Print all media items
    public static void printAllMedia() {
        for (Media m : allMedia) {
            System.out.println("Title: " + m.getTitle() + ", Genre: " + m.getGenre() + ", Rating: " + m.getRating());
        }
    }

    // toString override
    @Override
    public String toString() {
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart(); // Java 9+
        return "Media [Title=" + title + ", Genre=" + genre + ", Rating=" + rating +
               ", Duration=" + hours + "h " + minutes + "m]";
    }
}
