package Start;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BeanFactory {
    public static UserService getUser() throws Exception {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("E:/java/comeon/JavaEE/src/main/resources/applicationContext.properties");
        properties.load(fileInputStream);
        fileInputStream.close();
        Class cla = Class.forName(properties.getProperty("userService"));
        return (UserService) cla.newInstance();
    }
    private static final Properties env = new Properties();

    static{
        try {
            //第一步 获得IO输入流
                                                          //这里注意
            //InputStream inputStream = BeanFactory.class.getResourceAsStream("applicationContext.properties");
            FileInputStream fileInputStream=new FileInputStream("src/main/resources/applicationContext.properties");
            //第二步 文件内容 封装 Properties集合中 key = userService value = com.baizhixx.UserServiceImpl
            env.load(fileInputStream);
            fileInputStream.close();
            //inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*
        对象的创建方式：
           1. 直接调用构造方法 创建对象  UserService userService = new UserServiceImpl();
           2. 通过反射的形式 创建对象 解耦合
               Class clazz = Class.forName("com.baizhiedu.basic.UserServiceImpl");
               UserService userService = (UserService)clazz.newInstance();
     */

    public static UserService getUserService() {

        UserService userService = null;
        try {
                                         //com.baizhiedu.basic.UserServiceImpl
            Class clazz = Class.forName(env.getProperty("userService"));
            userService = (UserService) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return userService;

    }
    public static UserDAO getUserDAO(){

        UserDAO userDAO = null;
        try {
            Class clazz = Class.forName(env.getProperty("userDAO"));
            userDAO = (UserDAO) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return userDAO;

    }



     /*
      key 小配置文件中的key [userDAO,userService]
      */
     public static Object getBean(String key){
         Object ret = null;
         try {
             Class clazz = Class.forName(env.getProperty(key));
             ret = clazz.newInstance();
         } catch (Exception e) {
            e.printStackTrace();
         }
         return ret;
     }
}
