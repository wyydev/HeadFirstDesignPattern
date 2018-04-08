package com.android.hboxs020.headfirstdesignpattern.test01;

/**
 * Created by hboxs020 on 2018/4/4.
 */

public abstract class Character {

    protected WeaponBehavior mWeaponBehavior;

    abstract void fight();

    public WeaponBehavior getWeaponBehavior() {
        return mWeaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        mWeaponBehavior = weaponBehavior;
    }
}
