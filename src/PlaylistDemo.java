public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        Track defaultTrack = new Track();

        System.out.println("Default Track: ");
        System.out.println(defaultTrack);
        System.out.println();

        Track titleOnlyTrack = new Track("Neon Lights");

        System.out.println("Title Only Track: ");
        System.out.println(titleOnlyTrack);
        System.out.println();

        Track artistTitleTrack = new Track("Ocean Drive", "Midnight Pulse");

        System.out.println("Title and Artist Track: ");
        System.out.println(artistTitleTrack);
        System.out.println();

        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);

        System.out.println("Full Track (non-explicit): ");
        System.out.println(fullTrack);
        System.out.println();

        Track invalidTrack = new Track("Broken Clock", "Static Noise", -480, false);

        System.out.println("Invalid Duration Test: ");
        System.out.println(invalidTrack);
        System.out.println();


        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);

        System.out.println("Getter Test: ");
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());

    }
}
