package IoInter1;

// DATE: 2021/2/8-13:18  Happy Every Day


import org.junit.Test;

import java.io.*;
import java.net.*;

public class AllTest {
    @Test
    public void test1(){
        try {
            InetAddress ip1=InetAddress.getByName("127.0.0.1");
            System.out.println("ip1 = " + ip1);
            InetAddress ip2=InetAddress.getLocalHost();
            System.out.println("ip2 = " + ip2);
            System.out.println(ip1.getHostName());
            System.out.println(ip1.getAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void client() throws IOException {
       InetAddress ip1= InetAddress.getByName("192.168.137.1");
        Socket socket=new Socket(ip1,8899);
        OutputStream os = socket.getOutputStream();
        os.write("你好，我是客户端".getBytes());
        os.close();
        socket.close();
    }
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(8899);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
//        byte[] buffer=new byte[5];
//        int len;
//        while ((len=is.read(buffer))!=-1){
//            String str=new String(buffer,0,len);
//            System.out.print(str);
//        }
        ByteArrayOutputStream str=new ByteArrayOutputStream();
        byte[] buffer=new byte[5];
        int len;
        while ((len=is.read(buffer))!=-1){
            str.write(buffer,0,len);
        }
        System.out.println(str.toString());
        System.out.println(accept.getInetAddress());
        str.close();
        ss.close();
        ss.close();
        is.close();
    }
    @Test
    public void client1() throws IOException {
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9090);
        OutputStream os = socket.getOutputStream();
        FileInputStream fis= new FileInputStream(new File(".\\src\\IoInter\\爱情与友情.jpg"));
        byte[] bytes=new byte[5];
        int len;
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        //os.write("发送了一张图片请接收".getBytes());
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream str=new ByteArrayOutputStream();
        byte[] buffer=new byte[5];
        int len1;
        while ((len1=inputStream.read(buffer))!=-1){
            str.write(buffer,0,len1);
        }
        System.out.println(str.toString());
        socket.close();
        os.close();
        fis.close();
        str.close();
        inputStream.close();
    }
    @Test
    public void server1() throws IOException {
        ServerSocket ss=new ServerSocket(9090);
        Socket socket=ss.accept();
        InputStream is=socket.getInputStream();
        FileOutputStream os=new FileOutputStream(new File(".\\src\\IoInter1\\爱情与友情copy.jpg"));
        byte[] bytes=new byte[5];
        int len;
        while ((len=is.read(bytes))!=-1){
            //String str=new String(bytes,0,len);
            os.write(bytes,0,len);
            //System.out.println(str);
        }
        System.out.println("图片传输完成");
        //socket.shutdownInput();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好，照片已经收到".getBytes());

        ss.close();
        socket.close();
        is.close();
        os.close();
        outputStream.close();
    }
    @Test
    public void Url() throws IOException {
        URL url = new URL("http://localhost:8080/examples/hello.txt");//catalina
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.connect();
        InputStream is = urlConnection.getInputStream();
        FileOutputStream os = new FileOutputStream(new File(".\\src\\IoInter1\\hello.txt"));
        byte[] bytes=new byte[5];
        int len;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        System.out.println("下载完成");
        is.close();
        os.close();

//        //            public String getProtocol(  )     获取该URL的协议名
//        System.out.println(url.getProtocol());
////            public String getHost(  )           获取该URL的主机名
//        System.out.println(url.getHost());
////            public String getPort(  )            获取该URL的端口号
//        System.out.println(url.getPort());
////            public String getPath(  )           获取该URL的文件路径
//        System.out.println(url.getPath());
////            public String getFile(  )             获取该URL的文件名
//        System.out.println(url.getFile());
////            public String getQuery(   )        获取该URL的查询名
//        System.out.println(url.getQuery());
    }
    @Test
    public void send() throws IOException {
        DatagramSocket socket=new DatagramSocket();
        String str="我是UDP方式发送的";
        byte[] data=str.getBytes();
        InetAddress localHost = InetAddress.getLocalHost();
        DatagramPacket packet = new DatagramPacket(data,0,data.length,localHost,9090);
        socket.send(packet);
        socket.close();
    }
    @Test
    public void receiver() throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer=new byte[100];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
