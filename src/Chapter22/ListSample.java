package Chapter22;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
//        sample.checkArrayList7();
        sample.checkArrayList8();
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String [] tempArray = new String[3];
        String [] strList = list.toArray(tempArray);
        for (String temp : strList) {
            System.out.println(temp);
        }
    }

    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
//        System.out.println("Removed "+list.remove(0));
//        System.out.println(list.remove("A"));
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp);
        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println("list.get("+loop+")="+list.get(loop));
        }
    }
}
