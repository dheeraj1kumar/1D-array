import java.util.Arrays;
import java.util.Scanner;

public class merge_two_array {
        public static void main(String[] args) {
          int  c=0;
            int n1,n2;


        Scanner s= new Scanner(System.in);



        System.out.println("Enter size of array 1:");
        n1=s.nextInt();
            System.out.println("Enter size of array 2:");
            n2=s.nextInt();


            //creates an array
        int[] a1=new int[n1];
        int[]  a2=new int[n2];

        int l=a1.length+a2.length;
            int[]  a3=new int[l];

            System.out.println("Enter the array element 1:");
        for(int i=0;i<n1;i++){
            a1[i]=s.nextInt();

        }
            System.out.println("Enter the array element 2:");
            for(int i=0;i<n2;i++){
                a2[i]=s.nextInt();

            }
        System.out.println("merge array element:");
        for(int i:a1)
        {
            a3[c]=i;
            c++;
        }
            for(int i:a2)
            {
                a3[c]=i;
                c++;
            }
            for(int i=0;i<l;i++)
            {
            System.out.println(a3[i]);
            }

        //    System.out.println(Arrays.toString(a3));


    }
    }

