// DATE: 2021/2/24-13:57  Happy Every Day


import demo1.*;
import org.testng.annotations.Test;
public class demo1 {
    @Test
    public void test() throws Exception {
        UserService userService = beanfactory.getUserService();
        userService.insert("fanning","123456");
    }
}
