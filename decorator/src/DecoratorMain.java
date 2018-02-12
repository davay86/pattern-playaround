public class DecoratorMain {

    public static void main(String[] args){
        GraphicalComponent graphicalComponent = createGraphicalComponent();
        graphicalComponent = new BorderDecorator(graphicalComponent);
        graphicalComponent.paint();
    }

    public static GraphicalComponent createGraphicalComponent(){
        GraphicalComponent tf = new TextField();

        tf.addContent("One line");
        tf.addContent("Two line");
        tf.addContent("Three line");

        return tf;
    }
}
