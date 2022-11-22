import java.util.ArrayList;
import java.util.Scanner;

public class employee {
    double salary;
    String ecode,ename,desg,cname,email;
    long phno;

    public employee(double salary, String ecode, String ename, String desg, String cname, long phno, String email) {
        this.salary = salary;
        this.ecode = ecode;
        this.ename = ename;
        this.desg = desg;
        this.cname = cname;
        this.phno = phno;
        this.email = email;
    }

    public static void main(String[] args) {
        int i,n,choice;
        double salary;
        long phno;
        String ecode,ename,desg,cname,email;
        Scanner sc=new Scanner(System.in);
        ArrayList<employee> arr= new ArrayList<employee>();
        System.out.println("Enter 1-Add employee details\n 2-View employee details\n3-Search employee details\n4-Delete employee details\n5-Exit\nEnter your choice: ");
        choice= sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Number of employees: ");
                n = sc.nextInt();
                for (i=0;i<n;i++) {
                    System.out.println("Enter the following details \n Employee code: \nEmployee Name: \nDesignation: \nSalary: \nCompany Name: \nPhone no: \nEmail: ");
                    ecode=sc.next();
                    ename=sc.next();
                    desg=sc.next();
                    salary=sc.nextDouble();
                    cname=sc.next();
                    phno=sc.nextLong();
                    email=sc.next();
                }
                employee obj= new employee(salary,ecode,ename,desg,cname,phno,email);
                arr.add(obj);
                break;
            case 2:
                System.out.println("Displasy employee details:");
                for (employee emp : arr)
                {
                    System.out.println(emp.ecode);
                    System.out.println(emp.ename);
                    System.out.println(emp.desg);
                    System.out.println(emp.salary);
                    System.out.println(emp.cname);
                    System.out.println(emp.phno);
                    System.out.println(emp.email);
                }
                break;
            case 3:
                System.out.println("Enter employee code: ");
                String empcode=sc.next();
                for (employee e1 : arr)
                {
                    if (empcode==e1.ecode)
                    {
                        System.out.println("Details of employee are:");
                        System.out.println(e1.ecode);
                        System.out.println(e1.ename);
                        System.out.println(e1.desg);
                        System.out.println(e1.salary);
                        System.out.println(e1.cname);
                        System.out.println(e1.phno);
                        System.out.println(e1.email);
                        break;;
                    }
                    else System.out.println("Employee details not found");
                }
                break;;

        }
    }
}
