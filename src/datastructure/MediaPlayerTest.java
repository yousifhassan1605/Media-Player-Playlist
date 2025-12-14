package datastructure;

import java.time.Duration;

public class MediaPlayerTest {
    public static void main(String[] args) {
        // Create several Media instances
        Media m1 = new Media("Inception");
        m1.setGenre("Sci-Fi");
        m1.setRating(9.0);
        m1.setDuration(Duration.ofMinutes(148));

        Media m2 = new Media("Interstellar");
        m2.setGenre("Sci-Fi");
        m2.setRating(8.6);
        m2.setDuration(Duration.ofMinutes(169));

        Media m3 = new Media("The Dark Knight");
        m3.setGenre("Action");
        m3.setRating(9.1);
        m3.setDuration(Duration.ofMinutes(152));

        Media m4 = new Media("Tenet");
        m4.setGenre("Thriller");
        m4.setRating(7.5);
        m4.setDuration(Duration.ofMinutes(150));

        Media m5 = new Media("Memento");
        m5.setGenre("Mystery");
        m5.setRating(8.4);
        m5.setDuration(Duration.ofMinutes(113));

        Media m6 = new Media("Dunkirk");
        m6.setGenre("War");
        m6.setRating(7.9);
        m6.setDuration(Duration.ofMinutes(106));

        // Print all media
        System.out.println("All Media:");
        Media.printAllMedia();
        System.out.println();

        // Test remove method
        Media.removeMedia(m6);
        System.out.println("After removing Dunkirk:");
        Media.printAllMedia();
        System.out.println();

        // Test limitSize
        Media.limitSize(4);
        System.out.println("After limiting size to 4:");
        Media.printAllMedia();
        System.out.println();

        // Test top 5 rated (or fewer)
        System.out.println("Top Rated Media:");
        Media[] topRated = Media.getTopFiveRated();
        for (Media m : topRated) {
            System.out.println(m);
        }
    }
}
