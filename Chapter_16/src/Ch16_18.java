import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

    public class Ch16_18 {
        public static void main(String args[]) {

            List<String> initList = new LinkedList<>();
            initList.add("A");
            initList.add("B");
            initList.add("C");
            initList.add("D");
            initList.add("a");
            initList.add("b");
            initList.add("c");
            initList.add("d");
            initList.add("1");
            initList.add("2");
            System.out.println("Initial list: " + initList);
            List<String> reversedList = new LinkedList<>();
            Collections.reverse(initList);
            reversedList.addAll(initList);
            System.out.println("Reversed list: " + reversedList);
        }

    }

