public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][]myArr = new int[5][4];
        myArr[0][0] = 9;


        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(arr[1].length);

//        <------------- Traversal of 2D Array ---------------->
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
