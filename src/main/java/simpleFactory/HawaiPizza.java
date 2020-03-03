package simpleFactory;

import javax.naming.ldap.PagedResultsControl;
import java.util.List;

public class HawaiPizza extends Pizza {

    public HawaiPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.HAWAI);
    }
    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
