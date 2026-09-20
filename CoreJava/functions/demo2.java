package CoreJava.functions;

public class demo2 {
    public static void main(String [] args){
  

        int x= sum(4,7);
        int y=sum(2,5,6);
        
        System.out.println(x+","+y);
        
    }
    static int sum (int a, int b){
        
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static double sum(double a, double b){
        return (int) a+b;
    }

}
