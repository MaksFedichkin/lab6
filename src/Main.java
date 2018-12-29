import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        List myList = new ArrayList();
        List myList2;
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            myList.add(rand.nextInt(10));
        }
        System.out.println(myList);
        myList2 = myList;
        Collections.sort(myList2);
        System.out.println(myList2);

        Array s = new Array();
        s.createArray();
        All abcd = new All();
        abcd.mapping();
        abcd.out(10);
        abcd.outall();
    }
}