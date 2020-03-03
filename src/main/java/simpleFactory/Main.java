package simpleFactory;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ItalianPizza italianPizza = (ItalianPizza) new PizzaFactory().createPizza(PizzaType.ITALIAN);
        CapriciosaPizza capriciosaPizza = (CapriciosaPizza) new PizzaFactory().createPizza(PizzaType.CAPRICIOSA);
        HawaiPizza hawaiPizza = (HawaiPizza) new PizzaFactory().createPizza(PizzaType.HAWAI);
        MargheritaPizza margheritaPizza = (MargheritaPizza) new PizzaFactory().createPizza(PizzaType.MARGHERITA);

        italianPizza.showPizzaInfo();
        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();
    }

}
