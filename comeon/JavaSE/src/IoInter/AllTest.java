package IoInter;

// DATE: 2021/2/8-10:00  Happy Every Day


import org.junit.Test;

import java.io.*;

public class AllTest {
    @Test
    public void test1(){
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.dat"));
            objectOutputStream.writeObject(new String("我爱祖国"));
            objectOutputStream.writeObject(new String("祖国"));
            objectOutputStream.writeObject(new Person("TOm",232));
            objectOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void tes2(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj=objectInputStream.readObject();
            String str=(String) obj;
            String str1= (String) objectInputStream.readObject();
            Person per= (Person) objectInputStream.readObject();
            System.out.println(str);
            System.out.println(str1);
            System.out.println(per);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                assert objectInputStream != null;
                    objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test3(){
        RandomAccessFile r=null;
        RandomAccessFile rw=null;
        try {
            r = new RandomAccessFile(new File(".\\src\\IoInter\\爱情与友情.jpg"),"r");
            rw = new RandomAccessFile(new File(".\\src\\IoInter\\爱情与友情copy.jpg"), "rw");
            byte[] byt=new byte[5];

            int len;
            while ((len=r.read(byt))!=-1){
                rw.write(byt,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert r != null;
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert rw != null;
                rw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test4(){
        RandomAccessFile rw=null;
        RandomAccessFile r=null;
        try {
            rw = new RandomAccessFile(new File(".\\src\\IoInter\\hello.txt"),"rw");
            r = new RandomAccessFile(new File(".\\src\\IoInter\\hello.txt"),"r");
//            rw.seek(rw.length());
//            rw.write("你好".getBytes());
            rw.seek(4);
            r.seek(4);
//            StringBuilder str = new StringBuilder((int) new File(".\\src\\IoInter\\hello.txt").length());
            ByteArrayOutputStream str=new ByteArrayOutputStream();
            byte[] bytes=new byte[5];
            int len;
            //下面这种方法 插入特殊字符会乱码

//            while ((len=r.read(bytes))!=-1){
//                //assert str != null;
//                str.append(new String(bytes,0,len));
//            }
             while ((len=r.read(bytes))!=-1){
                 str.write(bytes,0,len);
             }

            rw.write("“哈哈，我是插入的”".getBytes());
            //rw.seek(rw.length());
            rw.write(str.toString().getBytes());
                System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert rw != null;
                 rw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                assert r != null;
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
