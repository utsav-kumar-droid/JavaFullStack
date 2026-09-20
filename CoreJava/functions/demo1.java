package CoreJava.functions;

public class demo1 {
    public static void main(String [] args){

    greet();
    sayHello("Utsav");
    System.out.println(getnum());
    System.out.println(sum(6,3));

    }

    // no output, no input
    static void greet(){
        System.out.println("Utsav");
    }
    // no out, in
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    // out, no in
    static int getnum(){
        return 10;
    }
   
    // out, in
    static int sum(int a, int b){
        return a+b;
    }
}
