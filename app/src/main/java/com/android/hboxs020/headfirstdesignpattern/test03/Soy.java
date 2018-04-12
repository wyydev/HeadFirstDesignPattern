package com.android.hboxs020.headfirstdesignpattern.test03;

/**
 *
 * Created by hboxs020 on 2018/4/9.
 */

public class Mocha extends CondimentDecorator {
    //被装饰者
     Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
