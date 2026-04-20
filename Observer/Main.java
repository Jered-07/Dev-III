package Observer;

public class Main {
    public static void main(String[] args) {
        InstagramSubject diego_zm = new InstagramSubject();
        YoutubeSubject rafa = new YoutubeSubject();

        diego_zm.addObserver(new InstagramObsever());
        rafa.addObserver(new YoutubeObserver());

        diego_zm.newReel("Nuevo reel bro");
        rafa.newVideo("Nuevo video perritos");

    }
}
     