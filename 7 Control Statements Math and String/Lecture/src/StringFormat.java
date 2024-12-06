public class StringFormat {
    public static void main(String[] args) {
        String name = "Pramod";
        int marks = 60245;
        System.out.println("Hello " + name + ", your marks are: " + marks);

        System.out.printf("Hello %s, your marks are: %d", name, marks);
        System.out.println();
        System.out.printf("Hello %S, your marks are: %d", name, marks);
        System.out.println();
        System.out.printf("Hii %10S, your marks are: %d", name, marks);
        System.out.println();
        System.out.printf("Hii %-10S, your marks are: %d", name, marks);
        System.out.println();
        System.out.printf("Hii, there %-10S, your marks are: %5d", name, marks);
        System.out.println();
        System.out.printf("Hii, there %-10S, your marks are: %05d", name, marks);
        System.out.println();
        System.out.printf("Hii, there %-10S, your marks are: %0,5d", name, marks);
        System.out.println();
        System.out.printf("Hii, there %-10S, your marks are: %+,5d", name, marks);
        System.out.println();
        System.out.printf("Hii, there %-10S, your marks are: %-+,5d", name, marks);

    }
}






/*
<------------------------------------------{"Using of String in Deep"}------------------------------------------------------>

1. Immutability:-----> Once created, a String object's value cannot be changed.Modifications create new String objects.
2. String Pool:------> Java maintains a pool of strings for efficiency. When a new sting is created, it's checked against
                       the pool for a match to reuse.
3. Comparing:--------> equals() method for value comparison, == operator checks reference equality.



<-------------------------------------------{"Using of String Class"}------------------------------------------------------->

1. Concatenation:----> String can be concatenated using the + operator,but each concatenation creates a new String.
1. Methods:----------> Provides methods like length(), substring(), equals(), compareTo(), indexOf(), for various operations.
1. Memory:-----------> Being immutable, strings can use more memory when frequently modified.


<------------------------------------------{"Using of 'Specifier' and 'Datatype' in String Class"}------------------------------------------------------>

Printf specifier                    DataType

%s                                  String of text
%f                                  floating point value (float or double)
%e                                  Exponential, scientific notation of a float or double
%b                                  boolean true or false value
%c                                  Single character char
%d                                  Base 10 integer, such as a Java int, long, short or byte
%o                                  Octal number
%x                                  Hexadecimal number
%%                                  Percentage sign
%n                                  New line, aka carriage-return
%tY                                 Year to four digits
%tT                                 Time in format of HH:MM:SS (ie 10:50:10)



<------------------------------------------{"Using of 'Flag' and 'Purpose' in String Class"}------------------------------------------------------>

Printf flag                         Purpose

<------------{ "% [flags] [width] [.precision] specifier-character" }-------------> formula of String adding

-                                   Aligns the formatted printf output to the left
=                                   The output includes a negative or positive sign
(                                   Places negative numbers in parentheses
0                                   The formatted printf output is zero padded
,                                   The formatted output includes grouping separators
<space>                             A blank space adds a minus sign for negative numbers and a leading space when positive.


 */
