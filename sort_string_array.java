//by selection string sort
public class sort_string_array {
//    public static void main(String[] args) {
//        String[] a={"deepak","rahul","ramesh","amit","bhuppi"};
//        int min;
//       String temp="";
//        for(int i=0;i<a.length;i++){
//            min=i;
//            for(int j=i+1;j<a.length;j++){
//                if(a[j].compareTo(a[min]) < 0)
//                {
//                    min=j;
//
//                }
//            }
//            temp=a[i];
//            a[i]=a[min];
//            a[min]=temp;
//        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]+" ");
//        }
//    }
//}

//simple  string array sort
    public static void main(String[] args) {
        String[] a={"deepak","rahul","ramesh","amit","bhuppi"};
        String temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j].compareTo(a[j+1])>0)
                {

            temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }}}
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}

