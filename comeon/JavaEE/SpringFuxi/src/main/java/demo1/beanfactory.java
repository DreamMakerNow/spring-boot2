package demo1;

// DATE: 2021/2/24-13:48  Happy Every Day


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class beanfactory {
    private static final Properties properties=new Properties();
    private static FileInputStream fis;
    static {
        try {
             fis=new FileInputStream("src/main/resources/applicationContext.properties");
             properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static UserService getUserService() throws Exception {
        Class cla=Class.forName(properties.getProperty("userService"));
        return (UserService) cla.newInstance();
    }
}
