import java.util.*;

public class Ch16_13 {
    public static void main(String[] args) {
        String firstName;
        String searchedName;
        Scanner input = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter First Name: ");
            names[i] = input.nextLine();
        }
        List<String> list = Arrays.asList(names);
        System.out.printf("%s ", list);
        System.out.println();

        removeDuplicates(list);
        System.out.println("Search a name: ");
        searchedName=input.nextLine();
        System.out.println("Name "+searchedName+" is in the list: "+ list.contains(searchedName));

    }

    private static void removeDuplicates(Collection<String> values) {
        Set<String> set = new HashSet<String>(values);
        for (String value : set) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }
}


