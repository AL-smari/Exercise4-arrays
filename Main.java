import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Q1
//        int [] q1 = {50,-20,0,30,40,60,50};
//        if(q1[0]==q1[q1.length-1]){
//            System.out.println("true");
//        }else System.out.println("false");

        //Q2
//
//        int [] q2 = {1,4,17,7,25,3,100};
//        double sum =0;
//        for(int x:q2){
//            sum = sum+x;
//
//        }
//        System.out.println("the average ="+sum/q2.length);
//        for(int x:q2){
//            if(x>sum/q2.length){
//                System.out.println(x);
//            }
//        }



        //Q3

//        int [] q3 = {20,30,40,50};
//        if(q3[0]>q3[q3.length-1]){
//            System.out.println(q3[0]);
//        }else System.out.println(q3[q3.length-1]);


        //Q4

//        int [] q4 = {40,9,23,55,3};
//        int [] swap = {40,9,23,55,3};
//        swap[0]=q4[4];
//        swap[4]=q4[0];
//        for(int i:swap){
//            System.out.println(i);
//        }



        //Q5

//        int [] q5 ={2,3,40,1,5,9,4,10,7};
//        ArrayList<Integer> swap = new ArrayList<>();
//        for (int i = 0; i <=q5.length-1 ; i++) {
//         if (q5[i]%2==1){
//             swap.add(q5[i]);
//         }
//
//        }
//        for (int i = 0; i <q5.length ; i++) {
//            if(q5[i]%2==0){
//                swap.add(q5[i]);
//            }
//
//        }
//        System.out.println(swap);

        //Q6

        int [] array1 = {2,3,6,6,4};
        int [] array2 = {2,3,6,6,4};
        int check =0;
        if(array1.length==array2.length){
            for (int i = 0; i <array1.length ; i++) {
                if (array1[i]==array2[i]){
                    check++;
                }

            }
            if (check==array1.length){
                System.out.println("true");
            }else System.out.println("false");
        }else System.out.println("false");



    }
}