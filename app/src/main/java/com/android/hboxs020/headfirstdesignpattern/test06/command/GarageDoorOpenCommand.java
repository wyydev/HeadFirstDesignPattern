package com.android.hboxs020.headfirstdesignpattern.test06.command;

import com.android.hboxs020.headfirstdesignpattern.test06.bean.Light;

/**
 * Created by hboxs020 on 2018/4/12.
 */

public class LightOnCommand implements Command {

   private Light mLight;

    public LightOnCommand(Light light) {
       this.mLight = light;
    }

    @Override
    public void execute() {
        mLight.on();
    }
}
