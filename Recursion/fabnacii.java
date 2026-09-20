package Recursion;


public class fabnacii {

    public static void main(String[] args) {
        int x = fibonacci(10);
        System.out.println(x);
    }

    static int fibonacci(int n){
        if(n==0 || n==1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

