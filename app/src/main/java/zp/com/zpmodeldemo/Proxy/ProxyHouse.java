package zp.com.zpmodeldemo.Proxy;

/**
 * 代理主题类
 */

public class ProxyHouse implements House{

    MyHouse myHouse = null;

    public ProxyHouse(MyHouse house){
        this.myHouse = house;
    }

    @Override
    public void sellHouse() {
        myHouse.sellHouse();
    }
}
