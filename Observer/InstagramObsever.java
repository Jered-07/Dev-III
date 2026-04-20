package Observer;

public class InstagramObsever implements Observer{

    @Override
    public void update(String ms) {
        System.out.println(ms);
    }
    
}
