public class continueStatement {
      public static void main(String[] args) {
        System.out.println("before loop:");
        for(int i=1;i<1000;i++){
            if(i==101||i==150){
                continue;
            }
            System.out.println(i);
        }
       System.out.println("Out of loop:");
    }
}
