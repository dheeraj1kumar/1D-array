import java.util.Scanner;

public class insert_element_in_array {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array:");
         int n=s.nextInt();
//int n=10;
        //creates an array
        int[] a=new int[n+1];
        System.out.println("Enter the array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }

        System.out.println("print  original array element:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println("enter no of position: ");
        int p=s.nextInt();
        System.out.println("Enter element to insert an array: ");
      int  data=s.nextInt();
      for(int i=n-1;i>=p-1;i--){
          a[i+1]=a[i];}
      a[p-1]=data;
        System.out.println("print after insert element");
        for(int i=0;i<n+1;i++){
            System.out.println(a[i]);

      }
    }
}

