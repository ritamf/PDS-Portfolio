import java.util.List;
import java.util.ArrayList;

class Subject {
    private List < Observer > observers = new ArrayList < > ();
    private int state;
    public void attach(Observer o) {
      observers.add(o);
    }

    public int getState() {
      return state;
    }

    public void setState(int in ) {
      state = in ;
      notifyObservers();
    }

    private void notifyObservers() {
      for (Observer obs: observers) {
        obs.update();
      }
    }

}