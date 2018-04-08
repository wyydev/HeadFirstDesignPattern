package com.android.hboxs020.headfirstdesignpattern.test01;

/**
 * Created by hboxs020 on 2018/4/4.
 */

public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("use knife to fight");
    }
}
