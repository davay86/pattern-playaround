import java.util.LinkedList;
import java.util.List;

public class TextField implements GraphicalComponent {
    private List<String> lines = new LinkedList();
    public void paint() {
        System.out.println("===Start text field===");
        lines.stream().forEach(System.out::println);
        System.out.println("===End text field===");

    }

    public void addContent(Object content) {
        if(content instanceof String){
            lines.add((String)content);
        }
    }
}
