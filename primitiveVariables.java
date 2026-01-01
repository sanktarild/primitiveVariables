package primitiveVariables;

import static java.lang.Thread.sleep;

public class primitiveVariables {
    byte a = 127;
    byte b = -128;
    short c = 32767;
    short d = -32768;
    int e = 2147483647;
    int f = -2147483648;
    void main(String[] args) throws InterruptedException {
        System.out.println("a- byte  + positive limit:  "+a);
        sleep(500);
        System.out.println("b- byte  - negative limit: "+b);
        sleep(500);
        System.out.println("c- short + positive limit:  "+c);
        sleep(500);
        System.out.println("d- short - negative limit: "+d);
        sleep(500);
        System.out.println("e- int   + positive limit:  "+e);
        sleep(500);
        System.out.println("f- int   - negative limit: "+f);
        sleep(500);
        System.out.println("Woaah :D");
    }
    /* values can be added at the end of a script because the code does not 
    follow instructions in order. Java follows code in a dependant instruction
    wise.*/
}