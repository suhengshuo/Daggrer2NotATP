package com.hellobike.dagger2notatp.object;

import com.hellobike.dagger2.annation.Inject;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 */
public class People {

    private String name = "张三";

    /**
     * @Inject: 此处仅代表对象是被注入的来源
     * 注: 第一处注解
     */
    @Inject
    public People(){

    }

    public String getName() {
        return name;
    }
}
