package OOPx.Interface.Test;

// DATE: 2021/1/28-18:53  Happy Every Day


public class f {
    public static void main(String[] args) {
        int x=9,y=10;
        f h=new f();
        System.out.println(h.bj(x,y));
    }
    public int bj(int a,int b){
        return Integer.compare(a,b);
    }
}