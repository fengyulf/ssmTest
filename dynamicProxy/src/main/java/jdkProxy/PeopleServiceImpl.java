package jdkProxy;

/**
 * 名称：LogServiceImpl<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 作者：fy <br>
 * 日期：2019/6/17 14:45 <br>
 * 说明：<br>
 */
public class PeopleServiceImpl implements PeopleService {

    public void sayHello() {
        System.out.println("hi");
    }

    public void sayHello(String userName) {
        System.out.println("向 "+userName+" say hello");
    }
}
