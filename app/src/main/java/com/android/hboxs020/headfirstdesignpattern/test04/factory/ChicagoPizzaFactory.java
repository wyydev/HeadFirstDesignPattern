package com.android.hboxs020.headfirstdesignpattern.test04;

import com.android.hboxs020.headfirstdesignpattern.test04.pizza.ChicagoStyleCheesePizza;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.ChicagoStyleGreekPizza;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.ChicagoStyleVeggiePizza;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.Pizza;

/**
 * Created by hboxs020 on 2018/4/11.
 */

public class ChicagoPizzaFactory extends SimplePizzaFactory {

    public  Pizza createPizza(PizzaType type){
        Pizza pizza = null;
        switch (type){
            case CHEESE:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case CLAM:
                pizza = new ChicagoStyleGreekPizza();
                break;
            case VEGGIE:
                pizza = new ChicagoStyleVeggiePizza();
                break;
                default:
                    break;
        }
        return pizza;
    }


}
