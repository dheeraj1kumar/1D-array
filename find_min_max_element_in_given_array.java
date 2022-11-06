import java.util.Scanner;

public class find_min_max_element_in_given_array {

        public static void main(String[] args) {
            int max;
            Scanner s= new Scanner(System.in);
            System.out.println("Enter size of array:");
            int n=s.nextInt();

            //creates an array
            int[] a=new int[10];
            System.out.println("Enter the array element:");
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();

            }
            System.out.println("print array element");
            for(int i=0;i<n;i++){
            System.out.println(a[i]);}
            max=a[0];
            for(int i=0;i<n;i++){
                // System.out.println(a[i]+"");
                if(max<a[i]){// if min then min>a[i]
                    max=a[i];}}
            System.out.println("largest number in array "+max);
            // return;




    }
}
