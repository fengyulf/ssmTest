package cglibProxy;

/**
 * 名称：CGlibProxyTest<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 作者：fy <br>
 * 日期：2019/6/17 16:51 <br>
 * 说明：CGlib动态代理:通过继承业务类，生成的动态代理类是业务类的子类，通过重写业务方法进行代理；
 */
public class CGlibProxyTest {
    public static void main(String[] args) {
        BookFacadeImpl bookFacade = (BookFacadeImpl) new CGlibProxyHandler().getProxy(new BookFacadeImpl());
        bookFacade.addBook();
    }
}
