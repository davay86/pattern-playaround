import java.util.Observable;
import java.util.Observer;

public class TempReporter implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("New temp is: " + arg);
    }
}
