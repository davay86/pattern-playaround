public interface Shape {
    void draw();

    static Shape create(String desc){
        switch(desc){
            case "Triangle":
                return new Triangle();
            case "Square":
                return new Square();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    }
}
