package com.android.hboxs020.headfirstdesignpattern.test04;

import com.android.hboxs020.headfirstdesignpattern.test04.pizza.NYStyleCheesePizza;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.NYStyleGreekPizza;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.Pizza;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.NYStyleVeggiePizza;

/**
 * Created by hboxs020 on 2018/4/11.
 */

public class NYPizzaFactory extends SimplePizzaFactory {

    public Pizza createPizza(PizzaType type){
        Pizza pizza = null;
        switch (type){
            case CHEESE:
                pizza = new NYStyleCheesePizza();
                break;
            case CLAM:
                pizza = new NYStyleGreekPizza();
                break;
            case VEGGIE:
                pizza = new NYStyleVeggiePizza();
                break;
                default:
                    break;
        }
        return pizza;
    }


}
