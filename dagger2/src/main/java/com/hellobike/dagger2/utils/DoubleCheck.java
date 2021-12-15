package com.hellobike.dagger2.utils;

import com.hellobike.dagger2.dagger2I.Provider;


/**
 * @Author Su Hengshuo
 * @Data 12/15/21
 * 单例处理类
 */
public class DoubleCheck<T> implements Provider<T> {

    /**
     * 单例的检查
     */
    private static final Object UNINITIALIZED = new Object();

    /**
     * 最上层实例化对象的接口
     */
    private volatile Provider<T> provider;

    private volatile Object instance = UNINITIALIZED;

    private DoubleCheck(Provider<T> provider){
        this.provider = provider;
    }

    /**
     * 单例，只实例化一次
     */
    @Override
    public T get() {
        Object result = instance;
        if (result == UNINITIALIZED){
            synchronized (this){
                result = instance;
                if (result == UNINITIALIZED){
                    instance = result = provider.get();
                    provider = null;
                }
            }
        }
        return (T) result;
    }

    public static <T> Provider<T> provider(Provider<T> delegate){
        Preconditions.checkNotNull(delegate);
        if (delegate instanceof DoubleCheck){
            return delegate;
        }
        return new DoubleCheck<T>(delegate);
    }

}
