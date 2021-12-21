package com.hellobike.dagger2notatp.dagger2Create;

import com.hellobike.dagger2.dagger2I.Factory;
import com.hellobike.dagger2notatp.object.People;


/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 模拟编辑器 APT 自动生成（第一处注解）
 */
public enum  PeoPle_Factory implements Factory<People> {

    INSTANSE;


    @Override
    public People get() {
        return new People();
    }

    public static Factory<People> create() {
        return INSTANSE;
    }
}
