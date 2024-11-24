
public class ForLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

//<--------------------------{Using for"For Loop"}--------------------------->

        for (int j = 1; j <= 100; j +=2){
            System.out.print(j + " ");

        }
    }
}


/*

<--------------------------{Rules for"For Loop"}--------------------------->

               for (initialization; condition; update) {
                    body of the loop
               }

Standard loop for running code multiple times.
Generally preferred for counting iterations.
 */
