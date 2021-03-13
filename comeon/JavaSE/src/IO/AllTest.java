package IO;

// DATE: 2021/2/7-13:56  Happy Every Day


import org.junit.Test;

import java.io.*;

public class AllTest {
    @Test
    public void test1() {
        FileReader fr= null;
        try {
            File file=new File("hello.txt");
            fr = new FileReader(file);
            //int data=fr.read();
            //fr.read();
//        while (data!=-1){
//            System.out.print((char) data);
//            data=fr.read();
//        }
            int data;
            while ((data=fr.read())!=-1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fr!=null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

       // System.out.println(data);
    }
    @Test
    public void test2() throws IOException {
        File file=new File("hello1.txt");
        FileReader fr = new FileReader(file);
        char[] str=new char[5];
        int len;
        while ((len= fr.read(str))!=-1){
//            for (int i = 0; i < len; i++) {
//                System.out.print(str[i]);
//            }
//            //System.out.println(len);
            String sts=new String(str,0,len);
            System.out.print(sts);
        }
        fr.close();
    }
    @Test
    public void test3(){
        File file=new File("hello1.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            fileWriter.write("I have a dream\n");
            fileWriter.write("The future beautiful\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test4() {
        FileReader fileReader = null;
        FileWriter fileWriter = null;


        try {
            File file = new File("hello.txt");
            File file1=new File("helloCopy.txt");
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);
            char[] str=new char[5];
            int data;
            while ((data=fileReader.read(str))!=-1)
                fileWriter.write(str,0,data);
            fileWriter.write("\nHelloCopy\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test5() {
        long start=System.currentTimeMillis();
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        try {
            File file = new File("hello.txt");
            File file1=new File("holloCopy.txt");
//            fileReader = new FileReader(file);
//            fileWriter = new FileWriter(file1);
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);
            byte[] str=new byte[3];
            int len;
            while ((len=fileInputStream.read(str))!=-1) {
                String strs=new String(str,0,len);
                 fileOutputStream.write(str, 0, len);
                System.out.print(strs);
            }
            //fileOutputStream.write("\nHelloCopy\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("\n花费时间："+(end-start));
        System.out.println(start);
        System.out.println(end);
    }
    @Test
    public void test6(){
        FileInputStream fileInputStream= null;
        FileOutputStream fileOutputStream= null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File src=new File("爱情与友情.jpg");
            File desc=new File("爱情与友情copy.jpg");

            fileInputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(desc);

            bis = new BufferedInputStream(fileInputStream);
            bos = new BufferedOutputStream(fileOutputStream);

            byte[] bytes=new byte[10];
            int len;
            while ((len=bis.read(bytes))!=-1){
                bos.write(bytes,0,len);
                bos.flush();//刷新缓冲区
//                String str=new String(bytes,0,len);
//                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test7(){
        FileInputStream fis=null;
        InputStreamReader isr=null;
        try {
            fis=new FileInputStream("hello.txt");
            isr = new InputStreamReader(fis, "UTF-8");

            char[] chars=new char[2];
            int len;
            while ((len=isr.read(chars))!=-1){
                String str=new String(chars,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test8(){
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream("out.txt",true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            if (printStream!=null)
                System.setOut(printStream);
            for (int i = 0; i < 100; i++) {
                if (i%2!=0)
                    System.out.println(i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //方法一 Scanner
        //方法二 System.in
        BufferedReader br=null;
        try {
            InputStreamReader irs = new InputStreamReader(System.in);
            br = new BufferedReader(irs);

            while (true){
                System.out.println("请输入字符串");
                String data= br.readLine();
                if (data.equalsIgnoreCase("e") || data.equalsIgnoreCase("exit"))
                    break;
                String uppCase=data.toUpperCase();
                System.out.println(uppCase);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
