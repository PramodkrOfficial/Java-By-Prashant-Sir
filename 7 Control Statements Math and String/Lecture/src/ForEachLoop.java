public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Ram", "Shyam", "Mohan", "Sohan", "Geeta", "Sita"
        };
        printArray(array);
        printArrayForEach(array);
    }
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
//      <------------------------------Professional Method used be ForEach Loop----------------------->
        for (String s : array) {
            System.out.println(s + " ");
        }
    }

    public static void printArrayForEach (String[] array) {
        for (String name : array) {
            System.out.print(name + " ");
        }
    }
}

/*
<-------------------------------------{Rules for "ForEach Loops"}-------------------------------------->

                            String[] object = new String[] {

                            };
                            for (String variable: object) {

                            }

A method for array iteration,often preferred for readability.
Parameters: One for item, optional second for index.
Using return is similar to continue in traditional loops.
Not straightforward to break out of a ForEach loop.
When you need to perform an action on each array element and don't need to break early.

Example:        String[] names = new String[] {
                    "Ram", "Shyam", "Mohan", "Sohan", "Geeta", "Sita",
                };
                for (String name: names) {
                    System.out.print(name + " ");
                }
 */



