package CoreJava.Array;

public class basic2 {
        // Multi dimensional arrays
   public static void main(String [] args){

        //    int [][] marks = new int[3][3];
        
        // marks[0][0]=23;
        // marks[0][1]=26;
        // marks[0][2]= 34;

        //  marks[1][0]=29;
        // marks[1][1]=86;
        // marks[1][2]= 54;

        // marks[2][0]=93;
        // marks[2][1]=78;
        // marks[2][2]= 20;

        // for(int row=0 ; row <marks.length; row ++){
        //     for(int col=0 ; col<marks[0].length; col++)
        //     {
        //        System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }


//    int [] []  marks = new int[3][];  
//    marks[0]= new int [1];
//    marks[1]= new int [2];
//    marks[2]= new int [3];

//    marks[0][0]=23;
//    marks[1][0]=25;
//    marks[1][1]=78;
//    marks[2][0]=98;
//    marks[2][1]=56;
//    marks[2][2]=45;

//     for(int row=0 ; row <marks.length; row ++){
//             for(int col=0 ; col<marks[row].length; col++)
//             {
//                System.out.print(marks[row][col] + " ");
//             }
//             System.out.println();
//         }


//  2-D array
int [][] marks = {
    {24,56,74},
    {36,75,90},
    {53,83,98}
};

for(int row=0 ; row <marks.length; row ++){
            for(int col=0 ; col<marks[row].length; col++)
            {
               System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
        




    }
}

