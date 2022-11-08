//Creating the custom wrapper class  
 class  w4{  
    private int i;  
    w4(){}
    w4(int i){  
    this.i=i;  
    }  
    public int getValue(){  
    return i;  
    }  
    public void setValue(int i){  
    this.i=i;  
    }  
    @Override  
    public String toString() {  
      return Integer.toString(i);  
    }  
    }  
    //Testing the custom wrapper class  
     class W4{  
    public static void main(String[] args){ 
        w4 j=new w4(10);  
    System.out.println(j);  
    }}  
