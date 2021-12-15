package com.hellobike.dagger2notatp.component;

import com.hellobike.dagger2.annation.Component;
import com.hellobike.dagger2notatp.MainActivity;
import com.hellobike.dagger2notatp.object.People;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 注：第三处注解
 */

@Component(modules = {People.class})
public interface PeoPleComponent {

    /**
     * 写入注入目标
     * @param mainActivity 注入目标，MainActivity 中的 this
     */
    void inject(MainActivity mainActivity);
}
