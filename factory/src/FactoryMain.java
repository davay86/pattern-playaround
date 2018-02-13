import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryMain {

    public static void main(String[] args){
        List<Shape> shapeList = Arrays.asList(Shape.create("Square"),Shape.create("Circle"),Shape.create("Triangle"));
        shapeList.stream().forEach(Shape::draw);
    }
}
