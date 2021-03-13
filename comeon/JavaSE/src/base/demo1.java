package base;// DATE: 2021/1/18-19:51  Happy Every Day

public class demo1 {
    public static void main(String[] args) {
        int a=1;
        float x=8.9f;
        double b=0.1;
        char c='c';
        byte d=12;
        System.out.println(a);
        System.out.println(a+c);
        //强制类型转换
        int a1=97;
        System.out.println("a1 = " + (char)a1);
        System.out.println((char)78);
        double b2=78.3;
        System.out.println("b2 = " + (int)b2);
        System.out.println("b2 = " + (char)b2);
        char c2='#';
        System.out.println("c2 = " + (int)c2);

        //String
        int number=4518121;
        String name="范蹦蹦:";
        System.out.println(name+number);

        System.out.println("*  *");
        System.out.println('*'+'\t'+'*');//93
        System.out.println('*'+"\t"+'*');
        System.out.println('*'+'\t'+"*");//51*
        System.out.println('*'+('\t'+"*"));

        System.out.println(4/3);
        short s=3;
        //s=s+2; 在这里 s=s+2 != s+=2
        System.out.println("s = " + s);
        s+=2;//这种写法不会改变数据本身的类型
        System.out.println("s = " + s);
        a*=b;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);
        int n=10;
        n+=(n++)+(++n);// n=n+(n++)+(++n) //n=10+10+12
        System.out.println("n = " + n);

        //逻辑运算符
        int x1=1,x2=1;
        if(x1++==2 & ++x2==2){
            x=7;
        }
        System.out.println("x1 = " + x1+" x2 = " + x2);// &前面的 false 后面的依然运行
        x1=1;x2=1;
        if(x1++==2 && ++x2==2){
            x=7;
        }
        System.out.println("x1 = " + x1+" x2 = " + x2);// &&前面的 false 后面的不运行 同 c 语言
    }
    // |  || 同理
    //运算符的级别高低
    // ++ -- ~ !(data type) * / % + - << >> >>> < > <= >= == != & ^ | && || ?: = *= /= %= += -= <<= >>= >>>= &= ^= |=

}
