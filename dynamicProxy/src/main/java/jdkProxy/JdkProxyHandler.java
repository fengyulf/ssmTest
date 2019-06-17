package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 名称：JdkProxyHandler<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 作者：fy <br>
 * 日期：2019/6/17 14:50 <br>
 * 说明：<br>
 */
public class JdkProxyHandler implements InvocationHandler {

    private Object target;

    public Object getProxy(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk代理 bofore");
        Object result = method.invoke(target, args);
        System.out.println("jdk代理 after");
        return result;
    }
}
