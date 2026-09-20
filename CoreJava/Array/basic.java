package CoreJava.Array;

public class basic {
    public static void main(String [] args){
           int [] rollno= new int [3];
        //    rollno[0]=101;
        //    rollno[1]=102;
        //    rollno[2]=103;

        //    System.out.println(rollno[0]);
        //    System.out.println(rollno[1]);
        //    System.out.println(rollno[2]);
           
        //    System.out.println(rollno.length);
        int x=101;
        for(int i=0;i<rollno.length;i++)
        {
            rollno[i]=x;
            x++;
        }

        for(int i=0; i<rollno.length; i++){
            System.out.println(rollno[i]);
        }
    }
}
