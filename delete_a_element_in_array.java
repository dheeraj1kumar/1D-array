import java.util.Scanner;

public class delete_a_element_in_array {
        public static void main(String[] args) {
            Scanner s= new Scanner(System.in);
            System.out.println("Enter size of array:");
            int n=s.nextInt();

            //creates an array
            int[] a=new int[n];
            System.out.println("Enter the array element:");
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();

            }

            System.out.println("print  original array element:");
            for(int i=0;i<n;i++){
                System.out.println(a[i]+"");
            }
            System.out.println("enter no of position which wants to delete: ");
            int p=s.nextInt();
            if(p>=n+1){
                System.out.println("deletion not possible ");
            }
            //System.out.println("Enter element to delete an array: ");
           // int  data=s.nextInt();
            else{
            for(int i=p-1;i<n-1;i++){
                a[i]=a[i+1];}
            //a[p-1]=data;
            System.out.println("print after delete element");
            for(int i=0;i<n-1;i++){
                System.out.println(a[i]);

            }}
        }
    }

