package OOPx.Interface;

// DATE: 2021/1/28-16:31  Happy Every Day
/*
    代理模式
 */

public class NetWorkTest {
    public static void main(String[] args) {
        Sever sever=new Sever();
        sever.browse();
        System.out.println("*************");
        ProxySever proxySever=new ProxySever(sever);
        proxySever.browse();
    }
}
interface Network{
   void browse();
}
//被代理类
class Sever implements Network{

    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类
class ProxySever implements Network{
    private final Network network;

    public ProxySever(Network network) {
        this.network = network;
    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        network.browse();
    }
}
