package Optional;

// DATE: 2021/2/12-14:33  Happy Every Day


import org.junit.Test;

import java.util.Optional;

public class AllTest {
    @Test
    public void test1(){
        Girl girl = new Girl();
        girl=null;
        Optional<Girl> optionalGirl=Optional.ofNullable(girl);
        System.out.println(optionalGirl);
    }
}
