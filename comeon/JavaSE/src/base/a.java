package base;

import java.util.ArrayList;
import java.util.Arrays;

// DATE: 2021/1/18-11:32
/*
    模板1、psvm或者main 调用 main 主函数（首字母）
    模板2、sout 调用输出(soutp soutm soutv xxx.sout)
    模板3、fori 调用for循环（iter itar）
    模板4、list.for 集合遍历(list.fori list.forr)
    模板5、ifn 最近的变量 ==null (inn xxx.nn)
    模板6、
 */
public class a {
    //模板1、psvm
    public static void main(String[] args) {
        //模板2、sout
        System.out.println();
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutv
        int a=1;
        System.out.println("a = " + a);
        //a.sout
        System.out.println(a);

        //模板3、fori
        for (int i = 0; i < 3; i++) {

        }
        //iter
        String[] arr=new String[]{"jack","Tom","Good"};
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //itart
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板4、list.for
        ArrayList list=new ArrayList();
        list.add(12);
        list.add(2);
        list.add(45);
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板5、ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        // xxx.nn 或者 xxx.null
        if (list == null) {

        }
    }
}
