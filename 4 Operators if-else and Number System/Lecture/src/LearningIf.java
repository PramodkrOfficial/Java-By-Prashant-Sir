import java.util.Scanner;

public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = true;
//        boolean isMale = false;
        String name = "Ros";

        System.out.println("before it");
        if (isMale) {
            System.out.println("Mr." + name);
        }else {
            System.out.println("Ms." + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = false;
        boolean isAnAdult = true;
        String user = "Pramod";

        if (isSeniorCitizen){
            System.out.println("Hello Senior Citizen.." + user);
        } else if (isAnAdult){
            System.out.println("Hello Adult.." + user);
        } else {
            System.out.println("Hello Child.." + user);
        }
    }
}
