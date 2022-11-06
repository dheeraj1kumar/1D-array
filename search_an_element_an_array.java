import java.util.Scanner;

public class search_an_element_an_array{

        public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();

        //creates an array
        int[] a=new int[10];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();}
        System.out.println("print array element:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"");
        }
            System.out.println("enter element which want to search");
            int a1=s.nextInt();
            for(int i=0;i<n;i++) {
                if (a[i] == a1) {
                    System.out.println(a1 + " is find at position " + i);
return ;

                }}
                    System.out.println("element not present");



    }
    }
