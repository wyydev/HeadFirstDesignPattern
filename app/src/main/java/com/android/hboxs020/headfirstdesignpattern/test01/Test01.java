package com.android.hboxs020.headfirstdesignpattern.test01;

/**
 *策略模式
 *
 * 定义了一族算法策略，分别封装起来，可以在使用中让它们之间相互替换，让算法得变化独立于使用算法的用户
 *
 *
 * Created by hboxs020 on 2018/4/4.
 */

public class Test01 {
    public static void main(String[] args) {
        Character character = new King();
        character.setWeaponBehavior(new SwordBehavior());
        character.fight();

        character.setWeaponBehavior(new BrowAndArrowBehavior());
        character.fight();
    }
}
