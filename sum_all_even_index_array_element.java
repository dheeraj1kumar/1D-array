import java.util.Scanner;

public class sum_all_even_index_array_element {

        public static void main(String[] args) {
            int sum=0;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter size of array:");
            int n=s.nextInt();

            //creates an array
            int[] a=new int[10];
            System.out.println("Enter the array element:");
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();

            }
            //System.out.println("print array element:");
            for(int i=0;i<n;i++){
                // System.out.println(a[i]+"");
                if(a[i]%2==0){
                    sum+=i;}}
            System.out.println("sum all even number in array "+sum);
            // return;



        }
    }

