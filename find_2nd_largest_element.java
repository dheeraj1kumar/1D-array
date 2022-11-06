import java.util.Scanner;

public class find_2nd_largest_element {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int first,second;
        System.out.println("Enter size of array:");
        int n=s.nextInt();

        //creates an array
        int[] a=new int[10];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            System.out.printf("index [%d]:",i);
            a[i]=s.nextInt();

        }
        first=second=0;
        for(int i=0;i<n;i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];

            } else if (a[i] > second && a[i] < first) {
                second = a[i];
            }
        }
        System.out.println("The first largest number:"+first);
        System.out.println("The 2nd largest number:"+second);

    }
}