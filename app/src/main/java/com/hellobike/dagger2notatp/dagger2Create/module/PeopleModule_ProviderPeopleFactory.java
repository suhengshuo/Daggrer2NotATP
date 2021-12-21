package com.hellobike.dagger2notatp.dagger2Create.module;

import com.hellobike.dagger2.dagger2I.Factory;
import com.hellobike.dagger2notatp.module.PeoPleModule;
import com.hellobike.dagger2notatp.object.People;
import com.hellobike.dagger2.utils.Preconditions;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 模拟编译器 APT 生成（第二处注解）
 */
public class PeopleModule_ProviderPeopleFactory implements Factory<People> {

    private PeoPleModule peoPleModule;

    public PeopleModule_ProviderPeopleFactory(PeoPleModule peoPleModule) {
        this.peoPleModule = peoPleModule;
    }

    @Override
    public People get() {
        return Preconditions.checkNotNull(
                peoPleModule.providerPeople(), "报错: peoPleModule.providerPeople()");
    }

    /**
     * 暴露外部使用的方法
     */
    public static Factory<People> create(PeoPleModule peoPleModule){
        return new PeopleModule_ProviderPeopleFactory(peoPleModule);
    }
}
