import java.util.Observable;

public class Thermometer extends Observable{

    public void changeTemp(int temp){
        setChanged();
        notifyObservers(temp);
    }
}
