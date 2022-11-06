import java.util.Scanner;

public class find_odd_even_element {

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
        System.out.println("print array element:");
        for(int i=0;i<n;i++){
           // System.out.println(a[i]+"");
            if(a[i]%2==0){
                System.out.println("all even number in array"+a[i]);
               // return;
            }
        }

    }
    }

