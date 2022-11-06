import java.util.Scanner;

public class sum_two_array_element_third_array {
    public static void main(String[] args) {
        int  c=0;
        int n;
        Scanner s= new Scanner(System.in);



        System.out.println("Enter size of array 1:");
        n=s.nextInt();
        System.out.println("Enter size of array 2:");
        n=s.nextInt();


        //creates an array
        int[] a1=new int[n];
        int[]  a2=new int[n];
        int[]  a3=new int[n];
        System.out.println("Enter the array element 1:");
        for(int i=0;i<n;i++){
            a1[i]=s.nextInt();

        }
        System.out.println("Enter the array element 2:");
        for(int i=0;i<n;i++){
            a2[i]=s.nextInt();

        }

        for(int i=0;i<n;i++){
            a3[i]=a1[i]+a2[i];
        }
        System.out.println("Sum  of two array element in third array");
        for(int i=0;i<n;i++){
            System.out.println(a3[i]);
        }


}}
