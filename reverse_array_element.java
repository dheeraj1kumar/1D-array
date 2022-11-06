import java.util.Scanner;

public class reverse_array_element {

        public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();

        //creates an array
        int[] a=new int[10];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        System.out.println("original array element:");
        for(int i=0;i<n;i++){
            System.out.println(+a[i]);
        }
            System.out.println("reverses element");
        for(int i=n-1;i>=0;i--){
            System.out.println(" "+a[i]+" ");

        }

    }
    }

