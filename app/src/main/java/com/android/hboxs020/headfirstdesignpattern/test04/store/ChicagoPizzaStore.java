package com.android.hboxs020.headfirstdesignpattern.test04.store;

import com.android.hboxs020.headfirstdesignpattern.test04.NYPizzaFactory;
import com.android.hboxs020.headfirstdesignpattern.test04.PizzaType;
import com.android.hboxs020.headfirstdesignpattern.test04.pizza.Pizza;

/**
 * Created by hboxs020 on 2018/4/12.
 */

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        return new NYPizzaFactory().createPizza(type);
    }
}
