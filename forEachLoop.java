public class forEachLoop {
    public static void main(String[] args) {
        String[] array=new String[]{
            "Tithi","pihu","Dolly","Nimki"
        };
        // printArray(array);
        printforEachArray(array);
    }
    public static void printforEachArray(String[] array) {
        for(String name:array){
            System.out.println(name);
        }
    }
    // public static void printArray(String[] array) {
    //     for(int i=0;i<array.length;i++){
    //         System.out.println(array[i]);
    //     }
    // }
}
