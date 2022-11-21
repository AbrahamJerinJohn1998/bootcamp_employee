import java.util.ArrayList;
import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        int choice,salary,i,n;
        String ecode,ename,desg,cname,phno,email;
        Scanner sc=new Scanner(System.in);
        ArrayList arr= new ArrayList<>();
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
                    salary=sc.nextInt();
                    cname=sc.next();
                    phno=sc.next();
                    email=sc.next();
                }
        }
    }
}
