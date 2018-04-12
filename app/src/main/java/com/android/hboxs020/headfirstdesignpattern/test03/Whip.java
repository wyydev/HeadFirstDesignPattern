package com.android.hboxs020.headfirstdesignpattern.test03;

/**
 *
 * Created by hboxs020 on 2018/4/9.
 */

public class Soy extends CondimentDecorator {
    //被装饰者
     Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.50 + beverage.cost();
    }
}
