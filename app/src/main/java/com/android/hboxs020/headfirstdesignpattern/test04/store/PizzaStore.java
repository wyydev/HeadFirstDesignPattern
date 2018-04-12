package com.android.hboxs020.headfirstdesignpattern.test04;

import com.android.hboxs020.headfirstdesignpattern.test04.pizza.Pizza;

/**
 * pizza生产中心
 *
 * Created by hboxs020 on 2018/4/11.
 */

public abstract class PizzaStore {


    public Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);
}
