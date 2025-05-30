import java.util.Scanner;

public class Encapsulation {

    private String StdName;
    private int  StdAge;

    public String getStdName() {
        return StdName;
    }
    public void setStdName(String stdName) {
        this.StdName = stdName;
    }

    public int getStdAge() {
        return StdAge;
    }

    public void setStdAge(int stdAge) {
        if(stdAge > 0) {
            StdAge = stdAge;
        } else  {
            System.out.println("Age is positive");
        }
    }

}


class StudentTesting {

    public static void main(String[] args) {
        Encapsulation s1 = new Encapsulation();

        //get value using in setter methods
        s1.setStdName("Pramod");
        s1.setStdAge(22);

        //get value using in getter methods
        System.out.println("Encapsulation.Student Name: " + s1.getStdName());
        System.out.println("Encapsulation.Student Age: " + s1.getStdAge());
    }
}


/*
<-----------------------------------------------{"Using Encapsulation Principle in Deep"}------------------------------------------------------------>

1.Definition:------------> Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to
                           the bundling of fields and methods inside a single class. It prevents outer classes from accessing
                           and changing fields and methods of a class. This also helps to achieve data hiding.
2.Data Hiding:-----------> Encapsulation hides internal data, allowing access only through methods.
3.Access Modifiers:------> Uses private, public, protected to control access to class members.
4.Getter/Setter:---------> Provides public methods for controlled property access.
5.Maintains Integrity:---> Protect objects state from external interface.
6.Enhances Modularity:---> Keeps classes separate and reduces coupling.

 */
