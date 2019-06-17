package jdkProxy;

/**
 * 名称：JdkProxyTest<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 作者：fy <br>
 * 日期：2019/6/17 14:50 <br>
 * 说明： JDK动态代理:通过接口中的方法名，在动态生成的代理类中调用业务实现类的同名方法；
 *
 * 静态代理:通过在代码中显式定义一个业务实现类一个代理，在代理类中对同名的业务方法进行包装，用户通过代理类调用被包装过的业务方法；
 */


public class JdkProxyTest {

    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        PeopleService peopleService = (PeopleService) new JdkProxyHandler().getProxy( new PeopleServiceImpl());
        peopleService.sayHello("fy");
    }
}
