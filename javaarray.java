import java.util.Scanner;

public class javaarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array element:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        for(int i=0;i<n;i++){
            if(a[i]%11==0){
                System.out.println("yes");
            }
            else{
                System.out.println("No");
            }
       }


    }
}
