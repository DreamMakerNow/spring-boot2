package File;

// DATE: 2021/2/7-10:43  Happy Every Day


import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    @Test
    public void test1(){
        File file=new File("hello.txt");
        File file1=new File("E:\\java\\comeon\\JavaSE\\src\\File\\word.txt");
//        System.out.println(file);
//        //File file1=new File(.,"java1");
//        System.out.println(file.getPath());
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.renameTo(file1));
//        System.out.println(file);
//        System.out.println(file1);
        File file2=new File("E:\\java\\comeon\\JavaSE\\src");
        File[] list=file2.listFiles();
        for(File name:list)
            System.out.println(name);
    }
    @Test
    public void test2() throws IOException {
//        File file=new File("..\\hi.txt");
//        System.out.println(file.createNewFile());
//        System.out.println(file.exists());
//        File file1=new File("E:\\java\\comeon\\JavaSE\\src\\ha\\haha\\haha");
//        //System.out.println(file1.mkdirs());
//        System.out.println(file1.exists());
//        System.out.println(file1.delete());
        File file=new File("E:\\java\\comeon\\hello.txt");
        File file1=new File(file.getParent(),"haha.txt");
        file1.createNewFile();
        System.out.println(file.getParent());
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());
    }
}
