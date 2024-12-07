public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Welcome Java_String ");
        sb.append(36);
        sb.append("hours");
        sb.append(", now this is the only testing purpose ");
        sb.append(90.95);
        sb.append("% ");
        sb.append(", And String tested by Pramod_Dev.");
        System.out.println(sb);
    }
}


/*
<------------------------------------------------{"Using of 'StringBuilder' and 'StringBuffer' in String class"}------------------------------------------------------->
<----------------------------{Syntax of 'StringBuilder'} ----------------------->

                    StringBuilder sentence = new StringBuilder ("This is a sentence.");
                    sentence.append("Added word.");
                    System.out.println(sentence.toString());    //  This is a sentence.Added word.


<--------------{"Comparing b/w 'String', 'StringBuilder' and 'StringBuffer' in String class"}-------------------->
Parameter                       String                          StringBuilder                           StringBuffer

mutability                      immutable                       mutable                                 'mutable'
Storage                         String constant pool            heap                                    'heap'
Thread Safety                   Not used in the threaded        Not thread-safe, so it is used in       Thread-safe, so it is used in
                                as it is immutable              a single-threaded environment           a multithreaded environment
Speed                           Comparably slowest              Comparably fastest                      Faster than String but Slower
                                                                                                        than StringBuilder





*/
