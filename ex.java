public class ex {
    public static int[] plusOne(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] < 9) {
                ++n[i];
            }

        }
return n;

    }

    public static void main(String[] args) {
        int[] n={1,2,3};
       int[] n1= plusOne(n);
        System.out.println(n1);
    }


}
