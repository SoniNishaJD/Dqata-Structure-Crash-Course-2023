public class Array {

    public static void main(String[] args) {
        /*
        * int [] arr =arr[5]
        * Arrays start with 0 index
        * In array we can 1] get data ,
        *  2] set data==> replacing ---> when we use set then it will show
        * 3] length of array
        * 4] Traverse on Array ==. use For loop
        * */
        int[] arr ={10,23,32,43,14};
        System.out.println(" get the data");
        //get
        System.out.println(arr[2]);

        System.out.println(" set the data");
        //set
        arr[2] = 77;
        System.out.println(arr[2]);

        System.out.println(" get the length of data");
        //length
        System.out.println(arr.length);

        System.out.println(" Traverse on Array");
        //Traverse on Array
        for (int i = 0; i< arr.length; i++){
             // arr[i]
        }
    }
}

