package simpleFactory;

import java.util.Arrays;

public class PizzaFactory {
    public Pizza createPizza(PizzaType pizzaType){
        if (PizzaType.ITALIAN.equals(pizzaType)){
            return new ItalianPizza(50, Arrays.asList("cheese","pepper","gran padano"));
        }else if (PizzaType.MARGHERITA.equals(pizzaType)){
            return new MargheritaPizza(24, Arrays.asList("cheese"));
        }else if (PizzaType.HAWAI.equals(pizzaType)){
            return new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
        }else if (PizzaType.CAPRICIOSA.equals(pizzaType)){
            return new CapriciosaPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
        }
        throw new IllegalArgumentException("Pizza type not supported");
    }
}
