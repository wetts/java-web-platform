package com.wetts.designpattern.factory_method.example;

import com.wetts.designpattern.factory_method.common.human.BlackHuman;
import com.wetts.designpattern.factory_method.common.human.Human;
import com.wetts.designpattern.factory_method.common.human.WhiteHuman;
import com.wetts.designpattern.factory_method.common.human.YellowHuman;

public class NvWa {

    public static void main(String[] args) {
        AbstractHumanFactory YinYangLu = new HumanFactory();
        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
