package ProjectZong.service;

// DATE: 2021/1/31-15:53  Happy Every Day


import org.junit.Test;

public class TeamServiceTest {
    @Test
    public void test1() throws TeamException {
        TeamService teamService=new TeamService();
        NameListService nameListService=new NameListService();
        teamService.addMember(nameListService.getEmployee(2));

       // teamService.addMember(nameListService.getEmployee(2));
        //teamService.removeMember(2);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(teamService.team[i].getMemberid());
//        }
      //  System.out.println(teamService.team.length);
       // teamService.removeMember(2);
        teamService.output();
    }
}
