
import java.util.Scanner;


class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private Subject subject[];

    public Student(String rollNo,String name,String dept)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        //this.subject=subject;
    }

    public String getRollNo() {return rollNo;}
    public String getName() {return name;}
    public String getDept() {return dept;}

    public void setSubject(int n)
    {
        Subject subs[]= new Subject[n];
        System.out.println(subs.length);
        String subId,subName;
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++)
        {

            System.out.print("enter Subject id : "); subId= sc.next();
            System.out.print("enter Subject name : "); subName=sc.next();
            subs[i]=new Subject(subId,subName);

        }
        this.subject=subs;
    }

    public Subject[] getSubject()
    {
        return this.subject;
    }

}
public class Main {
    public static void main(String[] args)
    {

        Student s= new Student("121","raghav","cse");
        s.setSubject(1);
        Subject sj[]=s.getSubject();
        for(Subject se:sj)
        {
            System.out.println(se.getSubName());
        }


    }
}