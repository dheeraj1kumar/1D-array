import java.util.Scanner;

public class sum_and_average_of_element {

        public static void main(String[] args) {
            int sum=0;
            float avg;

            Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();

        //creates an array
        int[] a=new int[10];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        System.out.println("print array element:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"");
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg =sum/n;
            System.out.println("Sum of all element in array is "+sum+" and average "+avg );
    }
    }

