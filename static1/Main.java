package static1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Add a1 = new Add();
        System.out.println(Add.plus(3, 5));

        Add.plus(0, 0);
        a1.plus(0, 0);
        int d = 10 * Add.c;
        System.out.println(d);
    }

}
