package simpleFactory;

import java.util.List;

public class MargheritaPizza extends Pizza {

    public MargheritaPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.MARGHERITA);
    }
    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
