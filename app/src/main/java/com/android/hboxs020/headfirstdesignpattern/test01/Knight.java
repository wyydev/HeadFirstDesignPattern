package com.android.hboxs020.headfirstdesignpattern.test01;

/**
 * Created by hboxs020 on 2018/4/4.
 */

public class Knight extends Character {
    @Override
    void fight() {
        if (mWeaponBehavior != null) {
            mWeaponBehavior.useWeapon();
        }
    }
}
