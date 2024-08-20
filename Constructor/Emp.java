public class Emp {
    public static void main(String[] args){
        System.out.println("main");
        EmpDemo e1 = new EmpDemo();
        EmpDemo e2 = new EmpDemo();

        e1.name="tejas";
        e1.Salary = 200000;

        e2.name = "John";
		e2.Salary = 50000;

        e1.showDetails();
        e2.showDetails();

        EmpDemo.PrintCompny();
    }
    static{
        System.out.println("Emp Class Is Loaded...");
    }
}

class EmpDemo{
    String name;
    float Salary;
    static String Company ="wipro";

    static{
        System.out.println("class loaded at static block");
    }
    {
        System.out.println("Emp object is created");
    }

    static void PrintCompny(){
        System.out.println("Compny name is:"+ EmpDemo.Company);
    }

    void showDetails(){
        System.out.println(this.name+","+this.Salary+","+EmpDemo.Company);
    }

    float getMonthSalary(){

        return this.Salary/12;
    }
}