package com.hellobike.dagger2notatp.Dagger2Create;

import com.hellobike.dagger2.dagger2I.MembersInjector;
import com.hellobike.dagger2.dagger2I.Provider;
import com.hellobike.dagger2notatp.MainActivity;
import com.hellobike.dagger2notatp.object.People;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 模仿编译器 APT 自动生成（第四处注解）
 * 真正完成依赖注入
 */
public class MainActivity_MembersInjector implements MembersInjector<MainActivity> {

    private Provider<People> peopleProvider;

    public MainActivity_MembersInjector(Provider<People> peopleProvider) {
        this.peopleProvider = peopleProvider;
    }

    /**
     * 提供一个静态的创建方法
     */
    public static MainActivity_MembersInjector create(Provider<People> peopleProvider) {
        return new MainActivity_MembersInjector(peopleProvider);
    }

    /**
     * 注入方法
     */
    @Override
    public void injectMember(MainActivity instance) {
        if(null == instance){
            throw new NullPointerException("inject target instance is null");
        }

        instance.peopleFirst = peopleProvider.get();
        instance.peopleSecond = peopleProvider.get();
    }
}
