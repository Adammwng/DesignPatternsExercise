package simpleFactory;

import java.util.List;

public class ItalianPizza extends Pizza {


    public ItalianPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.ITALIAN);
    }
    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
