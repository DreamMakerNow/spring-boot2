package ProjectZong.service;

// DATE: 2021/1/31-12:18  Happy Every Day


import org.testng.annotations.Test;

public class NameListServiceTest {
    @Test
    public void test() throws TeamException {
        NameListService test=new NameListService();
        for (int i = 0; i < test.getAEmployees().length; i++) {
            System.out.println(test.getAEmployees()[i].toString());
        }
        System.out.println("**********************");
        try {
            System.out.println(test.getEmployee(78));
        }catch (TeamException e){
            System.out.println("e = " + e);
        }
    }
}
