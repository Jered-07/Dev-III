package Observer;

import java.util.ArrayList;
import java.util.List;

public class InstagramSubject implements Subject{

    private String state;
    private List<Observer> list;

    

    public InstagramSubject() {
        list = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        list.forEach(ms -> ms.update(state));
    }

    public void newReel(String state){
        this.state = state;
        notifyObservers();
    }
    
}
