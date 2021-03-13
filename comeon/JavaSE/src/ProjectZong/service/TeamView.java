package ProjectZong.service;

// DATE: 2021/1/31-16:33  Happy Every Day


import ProjectZong.view.TSUtility;
import java.util.Scanner;

public class TeamView {
    Scanner scanner=new Scanner(System.in);
    TeamService teamService=new TeamService();
    NameListService nameListService=new NameListService();

    public void enterMainMenu() throws TeamException {
        System.out.println("1-团队列表\t2-添加团队内成员\t3-删除团队成员\t4-退出\t请选择(1-4):\n");
        listAllEmployees();
        boolean isFlag=true;
        while (isFlag) {
            System.out.print("请选择：\t");
            char menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '2':
                    addMember();
                    break;
                case '1':
                    getTeam();
                    break;
                case '3':
                    deleteMember();
                    break;

                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char yn = TSUtility.readConfirmSelection();
                    if (yn == 'Y')
                        isFlag = false;
                    break;

            }
            //按回车键继续
            TSUtility.readReturn();
        }
    }
    public void listAllEmployees(){
        System.out.println("---------------------------------------------开发团队调度软件---------------------------------------------");
        System.out.println("ID\t\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        for (int i = 0; i < nameListService.getAEmployees().length; i++) {
            System.out.println(nameListService.getAEmployees()[i].toString());
        }
    }
    public void getTeam(){
        if (teamService.total==0){
            System.out.println("当前没有团队\n");
            return;
        }
        System.out.println("TID/ID\t\t姓名\t\t年龄\t\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        for (int i = 0; i < teamService.total; i++) {
            System.out.println(teamService.team[i].getMemberid()+ "/"+teamService.team[i]);
        }
    }
    public void addMember() throws TeamException {
        System.out.println("请输入要添加的成员 ID : ");
        int id = TSUtility.readInt();
        try {
            teamService.addMember(nameListService.getEmployee(id));
        }catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
    }
    public void deleteMember() throws TeamException {
        System.out.println("请输入要删除的成员的 TID : ");
        int tid=TSUtility.readInt();
        try {
            teamService.removeMember(tid);
        }catch (TeamException e){
            System.out.println("删除失败"+e.getMessage());
        }
    }

    public static void main(String[] args) throws TeamException {

        TeamView test = new TeamView();
        test.enterMainMenu();
    }
}
