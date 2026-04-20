package Observer;

public class YoutubeObserver implements Observer {

    @Override
    public void update(String ms) {
        System.out.println(ms);
    }
    
}
