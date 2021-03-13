package PostProcessor;

// DATE: 2021/2/14-10:18  Happy Every Day


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyPose implements BeanPostProcessor {//它会对所在的Spring文件中的所有对象进行加工 所以这里单独写一个Spring配置文件
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        Categroy categroy= null;//这里进行保护，就不会影响其他对象了
        if (bean instanceof  Categroy) {
            categroy = (Categroy) bean;
            categroy.setName("xiaowb");
            return categroy;
        }else return bean;

    }
}
