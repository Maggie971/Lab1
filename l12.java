import java.util.ArrayList;
public class l12 {
    public static void main(String[] args) {
        // Initiate ArrayList with names
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Eve");
        names.add("Grace");

        // Switch first and last letters in each name
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchLetters(name));
        }

        // Output names and switched names
        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }

    public static String switchLetters(String name) {
        char first = Character.toUpperCase(name.charAt(0));
        char last = Character.toLowerCase(name.charAt(name.length() - 1));
        return last + name.substring(1, name.length() - 1) + first;
    }
}
