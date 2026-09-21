//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student s1= new Student("Utsav",76);
        Student s2=new Student();
        s1.setName("RaviSankar");
        s1.setMarks(74);
        System.out.println(s1.getName());
        System.out.println(s1.getMarks());
        System.out.println(s1);
    }
}