//2d Array
public class TwoDArray {
    /*
    * 1] set the data
    * get the data
    * */
    public static void main(String[] args) {
        int [] [] arr = new int [5][6];

        //set
        System.out.println("set");

        arr[1][3] =10;

        //get
        System.out.println("get");
        System.out.println(arr[1][3]);
        System.out.println(arr[2][5]);

        //Row Count
        System.out.println("Row Count");
        System.out.println(arr.length);

        //Column Count
        System.out.println("Column Count");
        System.out.println(arr[0].length);
    }
}
