package CoreJava.OOPS;

public class School {
    public static void main(String [] args){
     Student s1= new Student();
     Student s2=new Student();
     s1.name="Utsav kumar";
     s1.age=65;
     s1.rollnumber=101;
     s1.college="SATI";

      s2.name="Raju";
     s2.age=67;
     s2.rollnumber=102;
     s2.college="SATI";

     s1.markAttendance();
     s1.print();

     s2.markAttendance();
     s2.print();
    }
}

class Student{
String name;
int age;
int rollnumber;
String college;

void markAttendance(){
    System.out.println("Attendance is marked by "+name);
}
void print(){
    System.out.println("name:"+name+", age:"+age+", rollnumber:"+rollnumber+", college:"+college);
}

}


