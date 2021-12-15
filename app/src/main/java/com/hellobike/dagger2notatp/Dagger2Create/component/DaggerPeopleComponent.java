package com.hellobike.dagger2notatp.Dagger2Create.component;


import com.hellobike.dagger2.dagger2I.MembersInjector;
import com.hellobike.dagger2.dagger2I.Provider;
import com.hellobike.dagger2.utils.Preconditions;
import com.hellobike.dagger2notatp.Dagger2Create.MainActivity_MembersInjector;
import com.hellobike.dagger2notatp.Dagger2Create.module.PeopleModule_ProviderPeopleFactory;
import com.hellobike.dagger2notatp.MainActivity;
import com.hellobike.dagger2notatp.component.PeoPleComponent;
import com.hellobike.dagger2notatp.module.PeoPleModule;
import com.hellobike.dagger2notatp.object.People;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 模拟编译器 APT 生成（第三处注解）
 */
public class DaggerPeopleComponent implements PeoPleComponent {



    public DaggerPeopleComponent(Builder builder){
        initialize(builder);
    }

    /***
     * 第四处注解生成的代码
     */
    private Provider<People> providerPeopleProvider;
    private MembersInjector<MainActivity> mainActivityMembersInjector;

    private void initialize(final Builder builder){
        this.providerPeopleProvider = PeopleModule_ProviderPeopleFactory.create(builder.peoPleModule);
        this.mainActivityMembersInjector = new MainActivity_MembersInjector(providerPeopleProvider);
    }

    public static final class Builder{

        /**
         * 定义对象，联想第四处注解
         */
        PeoPleModule peoPleModule;

        private Builder(){

        }

        public PeoPleComponent build(){
            if(peoPleModule == null){
                peoPleModule = new PeoPleModule();
            }

            return new DaggerPeopleComponent(this);
        }

        /**
         * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
         */
        @Deprecated
        public Builder studentModule(PeoPleModule peoPleModule) {
            Preconditions.checkNotNull(peoPleModule);
            return this;
        }

    }

    private static Builder builder(){
        return new Builder();
    }

    public static PeoPleComponent create(){
        return builder().build();
    }

    /**
     * 第四处注解生成
     * 像目标 MainActivity 中去注入
     */
    @Override
    public void inject(MainActivity mainActivity) {
        mainActivityMembersInjector.injectMember(mainActivity);
    }
}
