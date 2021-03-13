package ProjectZong.service;

// DATE: 2021/1/31-9:52  Happy Every Day

//员工状态 单例模式 三个对象
public class Status {
    private final String NAME;
    public Status(String name){
        NAME = name;
    }

    public String getNAME() {
        return NAME;
    }

    public static final Status FREE=new Status("FREE");//空闲
    public static final Status BUSY=new Status("BUSY");//已加入开发团队
    public static final Status VOCATION=new Status("VOCATION");//正在休假

    @Override
    public String toString() {
        return  "\t\t"+NAME;
    }
}
