public abstract class Decorator implements GraphicalComponent{

    GraphicalComponent next;
    public Decorator(GraphicalComponent graphicalComponent) {
        this.next = graphicalComponent;
    }

    @Override
    public void paint() {
        this.next.paint();
    }

    @Override
    public void addContent(Object content) {
        this.next.addContent(content);
    }
}
