package fuxi.IO;

// DATE: 2021/2/24-10:21  Happy Every Day


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Test {
    @org.testng.annotations.Test
    public void test() throws Exception {
        FileReader fis=new FileReader("fuxi");
        char[] chars=new char[100];
        int len;
        while ((len= fis.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        fis.close();
    }
    @org.testng.annotations.Test
    public void test1() throws Exception {
        FileInputStream fis=new FileInputStream("lufei.jpg");
        FileOutputStream fos=new FileOutputStream("lufeiCopy.jpg");
        byte[] bytes=new byte[5];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
