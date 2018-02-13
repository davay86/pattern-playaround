public class ObserverMain {
    public static void main(String[] args){
        TempReporter tempReporter = new TempReporter();
        TempReactor tempReactor = new TempReactor();

        Thermometer thermometer = new Thermometer();
        thermometer.addObserver(tempReactor);
        thermometer.addObserver(tempReporter);

        thermometer.changeTemp(60);
        System.out.println("Change of temp");
        thermometer.changeTemp(20);
    }
}
