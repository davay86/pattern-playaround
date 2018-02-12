public class BorderDecorator extends Decorator {
    public BorderDecorator(GraphicalComponent graphicalComponent) {
        super(graphicalComponent);
    }

    @Override
    public void paint() {
        System.out.println("----------Border-------------");
        super.paint();
        System.out.println("----------Border-------------");
    }

    @Override
    public void addContent(Object content) {
        super.addContent(content);
    }
}
