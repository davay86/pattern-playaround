import java.util.Observable;
import java.util.Observer;

public class TempReactor implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        if((Integer)arg > 50){
            System.out.println("TEMP TOO HIGH!!!!!!");
        }else{
            System.out.println("TEMP FINE!!!!!");
        }
    }
}
