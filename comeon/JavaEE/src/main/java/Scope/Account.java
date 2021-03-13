package Scope;

// DATE: 2021/2/13-15:19  Happy Every Day

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/*
    生命周期的三个阶段
        ->创建
        ->初始化
        ->销毁
 */
// 控制简单对象创建的数量
//在文件中添加 scope="singleton" 默认是 singleton 如果创建多个scope="prototype"
//在文件中添加 lazy-init="true"
public class Account implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {//注入在初始化之前
        System.out.println(name);
        this.name = name;
    }

    public Account(){
        System.out.println("Account.account");
    }
    @Override//初始化方法一 实现InitializingBean接口
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化操作1");
    }
    //销毁方法只适用于 scope="singleton"
    public void myInit(){//初始化方法一 写一个普通方法 在文件中添加这个方法 init-method="myInit"
        System.out.println("初始化操作2");
    }

    @Override
    public void destroy() throws Exception {//销毁方式一 实现DisposableBean接口 工厂关闭才会销毁
        System.out.println("销毁程序1");
    }
    public void myDestroy(){//销毁方式二 在文件中添加 destroy-method="close" 的普通方法
        System.out.println("销毁程序2");
    }
}
