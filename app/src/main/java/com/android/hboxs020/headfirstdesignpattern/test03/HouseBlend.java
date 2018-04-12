package com.android.hboxs020.headfirstdesignpattern.test03;

/**
 * Created by hboxs020 on 2018/4/8.
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        return 1.89;
    }
}
