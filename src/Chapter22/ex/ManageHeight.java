package Chapter22.ex;

import java.util.ArrayList;

public class ManageHeight {

    ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();

    public static void main(String[] args) {
        ManageHeight sample = new ManageHeight();
        sample.setData();
        for(int i=1; i<=5; i++){
            System.out.println("Class NO.:"+i);
            sample.printHeight(i);
        }
    }

    public void setData() {
        ArrayList<Integer> tempList1 = new ArrayList<>();
        tempList1.add(170);
        tempList1.add(180);
        tempList1.add(173);
        tempList1.add(175);
        tempList1.add(177);
        gradeHeights.add(tempList1);

        ArrayList<Integer> templList2 = new ArrayList<>();
        templList2.add(160);
        templList2.add(165);
        templList2.add(167);
        templList2.add(186);
        gradeHeights.add(templList2);

        ArrayList<Integer> templList3 = new ArrayList<>();
        templList3.add(158);
        templList3.add(177);
        templList3.add(187);
        templList3.add(176);
        gradeHeights.add(templList3);

        ArrayList<Integer> templList4 = new ArrayList<>();
        templList4.add(173);
        templList4.add(182);
        templList4.add(181);
        gradeHeights.add(templList4);

        ArrayList<Integer> tempList5 = new ArrayList<>();
        tempList5.add(170);
        tempList5.add(180);
        tempList5.add(165);
        tempList5.add(177);
        tempList5.add(172);
        gradeHeights.add(tempList5);
    }

    public void printHeight(int classNo) {
        for (int height : gradeHeights.get(classNo-1)) {
            System.out.println(height);
        }
    }
}
