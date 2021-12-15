package com.hellobike.dagger2.dagger2I;

/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 依赖注入标准
 */
public interface MembersInjector<T> {
    void injectMember(T instance);
}
