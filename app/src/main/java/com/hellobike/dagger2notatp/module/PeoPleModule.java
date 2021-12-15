package com.hellobike.dagger2notatp.module;

import com.hellobike.dagger2.annation.Module;
import com.hellobike.dagger2.annation.Provides;
import com.hellobike.dagger2notatp.object.People;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 注：第二处注解
 */

@Module
public class PeoPleModule {

    @Provides
    public People providerPeople(){
        return new People();
    }
}
