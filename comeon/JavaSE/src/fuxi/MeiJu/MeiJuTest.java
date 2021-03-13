package fuxi.MeiJu;

// DATE: 2021/2/23-12:32  Happy Every Day


public class MeiJuTest {
    public static void main(String[] args) {
        season season = fuxi.MeiJu.season.SPRING;
        System.out.println(season);
    }
}
class season{
    private final String spring;
    private final String summmer;

    private season(String spring, String summmer) {
        this.spring = spring;
        this.summmer = summmer;
    }


    public static final season SPRING=new season("春天","春暖花开");
    public static final season SUMMER=new season("夏天","夏日炎炎");

    @Override
    public String toString() {
        return "season{" +
                "spring='" + spring + '\'' +
                ", summmer='" + summmer + '\'' +
                '}';
    }
}
