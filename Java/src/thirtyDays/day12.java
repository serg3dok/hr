package thirtyDays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student{
    protected String firstName;
    protected String lastName;
    int phone;
    Student(String fname,String lname,int p){
        firstName=fname;
        lastName=lname;
        phone=p;

    }
    public void display(){// display the details of the student
        System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone);
    }

}



    class Grade extends Student{
        private int score;
        Grade(String fn, String ln, int ph, int sc)
        {
            super(fn, ln, ph);
            score = sc;
        }


        char calculate()
        {
            if (score < 40) return 'D';
            else if (score < 60) return 'B';
            else if (score < 74) return 'A';
            else if (score < 89) return 'E';
            else if (score < 101) return 'O';
            return 'E';


        }
}




public class day12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu = new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.calculate());

    }
}