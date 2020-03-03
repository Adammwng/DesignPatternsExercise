package simpleFactory;

import java.util.List;

public class CapriciosaPizza extends  Pizza {


    public CapriciosaPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.CAPRICIOSA);
    }
    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
