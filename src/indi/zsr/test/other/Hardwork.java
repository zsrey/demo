package indi.zsr.test.other;
/**
 * 统计员工薪水
 * */
public class Hardwork {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee[] employees =new Employee[20];//初始化一个20人的员工数组
        for(int i =0;i<employees.length;i++) {
            if(i%3==0)
                employees[i]=new WeekWorker();
            if(i%3==1)
                employees[i]=new MonthWorker();
            if(i%3==2)
                employees[i]=new YearWorker();
        }
        Conmany conmany =new Conmany(employees);
        System.out.println("公司总薪水："+conmany.salariesPay());
    }
}

//定义一个员工抽象类
abstract class Employee{
    //定义一个计算工资的抽象方法
    abstract public double earnings();
}

class YearWorker extends Employee{

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return 50000;
    }

}

class MonthWorker extends Employee{

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return 2500*12;
    }

}

class WeekWorker extends Employee{

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return 52*500;
    }

}
//定义一个公司类
class Conmany{
    Employee[] employees;//int a [20];
    double salaries=0;
    //初始化构造函数
    public  Conmany(Employee[] employees) {
        this.employees=employees;
    }

    public double salariesPay() {
        salaries=0;
        for(int i=0; i<employees.length;i++) {
            salaries +=employees[i].earnings();
        }

        return salaries;
    }

}