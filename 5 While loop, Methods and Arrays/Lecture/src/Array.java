import java.security.AlgorithmConstraints;

public class Array {
    public static void main(String[] args) {
        /*
        int[] myArr = new int[5];
        myArr[0] = 58;
        myArr[1] = 65;
        myArr[2] = 35;
        myArr[3] = 42;
        myArr[4] = 25;
    <----------------- Beginner way of Coding style ----------------->
        int[] myArr = {58, 65,35, 42, 25};
        int index = 1;
        int index1 = 3;

        System.out.println(myArr[0]);
        System.out.println(myArr[index]);
        System.out.println(myArr[2]);
        System.out.println(myArr[index1]);
        System.out.println(myArr[4]);
         */

//       <--------- Array Traversal --------->
        int[] myArr = {45,64,44,75,23};
        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }

//       <--------- String Traversal --------->

        String[] strArr = new String[5];
        System.out.println("\nWelcome to string traversal");
        strArr[0] ="My String";
        String[] newstrArr = {"first","second", "third"};
        System.out.println(newstrArr.length);
    }
}




/*  <---------------------------[ ARRAY] ------------------------------->

Array :- Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
Java array is an object which contains elements of a similar data type. Additionally, The elements of an array are stored in a contiguous memory location. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable. They are useful for managing collections of data efficiently.
    example :- String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
             int[] myNum = {10, 20, 30, 40};

Types of Array in java

There are two types of array.

Single Dimensional Array
Multidimensional Array

Single Dimensional Array in Java

dataType[] arr; (or)
dataType []arr; (or)
dataType arr[];

example :- arrayRefVar = new datatype[size];


Multidimensional Array in Java
In such case, data is stored in row and column based index (also known as matrix form).

dataType[][] arrayRefVar; (or)
dataType [][]arrayRefVar; (or)
dataType arrayRefVar[][]; (or)
dataType []arrayRefVar[];


int[][] arr=new int[3][3];//3 row and 3 column

 */
