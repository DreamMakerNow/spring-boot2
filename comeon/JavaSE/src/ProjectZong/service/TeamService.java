package ProjectZong.service;

// DATE: 2021/1/31-12:23  Happy Every Day


import ProjectZong.domain.Architect;
import ProjectZong.domain.Designer;
import ProjectZong.domain.Employee;
import ProjectZong.domain.Programmer;

import java.util.Arrays;
import java.util.Scanner;

public class TeamService {
    Scanner scanner=new Scanner(System.in);
    private static int counter=1;//用来记录自动生成团队的唯一 id
    final int MAX_MEMBER = 5;//开发团队的最大成员数
    Programmer[] team=new Programmer[MAX_MEMBER];//保存团队成员
    int total=0;//团队的实时人数

    public Programmer[] getTeam() {
        Programmer[] team=new Programmer[total];
        if (team.length >= 0) System.arraycopy(this.team, 0, team, 0, team.length);
        return team;
    }
    public void addMember(Employee e) throws TeamException {//向团队中添加成员
        if (total >= MAX_MEMBER)
            throw new TeamException("成员已满");
        if (!(e instanceof Programmer))
            throw new TeamException("该成员不是开发人员");
       if (isExit(e))
           throw new TeamException("该成员已在本团队");
       //e=(Programmer)e;
        Programmer p=(Programmer )e;
       if ("BUSY".equals(p.getStatus().getNAME()))
            throw new TeamException("该成员已在其它团队");
       else if ("VOCATION".equals(p.getStatus().getNAME()))
           throw new TeamException("该成员正在休假中 不可添加！！！！");

       //获取团队中各职业的数量
       int architectNumber=0,designerNumber=0,programmerNumber=0,employeeNumber=0;
        for (int i = 0; i < total; i++) {
            if (e instanceof Architect){
                architectNumber++;
            }else if (e instanceof Designer){
                designerNumber++;
            }else programmerNumber++;
        }

       if (e instanceof Architect){
           if (architectNumber >= 1)
               throw new TeamException("一个团队中最多有一个架构师");
       }else if (e instanceof Designer){
           if (designerNumber  >= 2)
               throw new TeamException("一个团队中最多有两个设计师");
       }else {
           if (programmerNumber >= 3)
               throw new TeamException("一个团队中最多有三名程序员");
       }
       team[total++]=(Programmer) e;
       ((Programmer) e).setStatus(Status.BUSY);
       ((Programmer) e).setMemberid(counter++);
        System.out.println("添加成功");
    }

    private boolean isExit(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].equals(e))
                return true;
        }
        return false;
    }

    public void removeMember(int memberid) throws TeamException {
        int i;
        for (i = 0; i < total; i++) {
                if (team[i].getMemberid() == memberid) {
                        team[i].setStatus(Status.FREE);
                        break;
                    }
        }
        if (i==total)
            throw new TeamException("找不到指定memberId的员工，删除失败\n");
        for ( ; i < total-1; i++) {
            team[i]=team[i+1];
        }
        team[total--]=null;
        System.out.println("删除成功");


    }
    public void output(){
        for (int i = 0; i < total; i++) {
            System.out.println(team[i]);
        }
    }

    @Override
    public String toString() {
        return "TeamService{" +
                "scanner=" + scanner +
                ", MAX_MEMBER=" + MAX_MEMBER +
                ", team=" + Arrays.toString(team) +
                ", total=" + total +
                '}';
    }
}
