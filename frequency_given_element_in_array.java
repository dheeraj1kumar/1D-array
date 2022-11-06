import java.util.Scanner;

public class frequency_given_element_in_array {
    public static void main(String[] args) {
        int c=0;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();

        //creates an array
        int[] a=new int[10];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        System.out.println("enter element to find frequency :");
        int f=s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==f){
                c++;}
            }
            System.out.println("frequency of given element: "+c);
        }
    }


