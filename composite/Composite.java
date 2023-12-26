import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private String name;
    private List<Component> componentList = new ArrayList<>();

    public void addComponent(Component component){
        componentList.add(component);
    }

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component component: componentList){
            component.showPrice();
        }
    }
}
