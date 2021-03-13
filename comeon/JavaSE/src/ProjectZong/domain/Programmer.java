package ProjectZong.domain;

// DATE: 2021/1/31-9:46  Happy Every Day


import ProjectZong.service.Status;

public class Programmer extends Employee implements Equipment{
    private int memberid;//开发团队id
    private Status status=Status.FREE;
    private Equipment equipment;
    public Programmer(){}
    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }
    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String toString() {
        return id +"\t\t"+ name + "\t\t" + age + "\t\t\t" + salary + "\t\t" + "程序员"+ getStatus() +"\t\t\t\t\t\t"+ "\t\t" + getEquipment();
    }


    public String getDetailsForTeam() {
        return memberid+"/"+getId()+"\t\t"+getName()+"\t\t"+getAge()+"\t\t"+salary+"\t\t"+"程序员";
    }
}
