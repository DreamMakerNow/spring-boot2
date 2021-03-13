package ProjectZong.service;

// DATE: 2021/1/31-10:14  Happy Every Day


import ProjectZong.domain.*;

import java.util.Arrays;

import static ProjectZong.service.Data.*;

public class NameListService {
    private Employee[] employees;

    public NameListService(){
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type=Integer.parseInt(EMPLOYEES[i][0]);
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][2];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salsry=Double.parseDouble(EMPLOYEES[i][4]);
            switch (type){
                case EMPLOYEE: {
                    employees[i]=new Employee(id,name,age,salsry);
                    break;
                }
                case PROGRAMMER:{
                    Equipment equipmentProgramer=createProgrmer(i);
                    employees[i]=new Programmer(id,name,age,salsry,equipmentProgramer);
                    break;
                }
                case DESIGNER:{
                    double bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i]=new Designer(id,name,age,salsry,createProgrmer(i),bonus);
                    break;
                }
                case ARCHITECT:{
                    double bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    int stock=Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i]=new Architect(id,name,age,salsry,createProgrmer(i),bonus,stock);
                }
            }
        }
    }


    private Equipment createProgrmer(int index) {
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        switch (type) {
            case PC: {
                String model = EQUIPMENTS[index][1];
                String display = EQUIPMENTS[index][2];
                return new PC(model, display);
            }
            case NOTEBOOK: {
                String model = EQUIPMENTS[index][1];
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model, price);
            }
            case PRINTER: {
                String name = EQUIPMENTS[index][1];
                String typePrinter = EQUIPMENTS[index][2];
                return new Printer(name, typePrinter);
            }
        }
        return null;
    }
    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getAEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public  Employee getEmployee(int id) throws TeamException {
        boolean flag=true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId()==id) {
                flag=false;
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }


    @Override
    public String toString() {
        return "NameListService{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

}
