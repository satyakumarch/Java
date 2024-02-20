package OOpsinjava;
import java.util.Scanner;
public class studentclass {
    //creating a new data type
    public static class  Student{
        String name;
        int roll;
        double percent;

    }
    public  static  void  change(Student s){
         s.name="shyam";
        return;
    }

    public static void main(String[] args) {
        Student s1=new Student();
       Student x=new Student();
//       x.name="satya";
//       x.roll=23;
//       x.percent=34;
//        System.out.println("Name:"+x.name+" RollNo:"+x.roll+" percent:"+x.percent);
        System.out.println(s1.name);
        change(s1);
        System.out.println(s1.name);

    }
}
