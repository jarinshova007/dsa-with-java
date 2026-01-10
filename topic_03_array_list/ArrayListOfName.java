package topic_03_array_list;

// Take an ArrayList of names as input from the user and print them on the screen
import java.util.ArrayList;

class ArrayListOfName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        // add
        names.add("Jarin");
        names.add("Shova");
        names.add("Joynab");
        names.add("Mitu");

        // print
        System.out.println(names);

        // print names serially
        for (int i = 0; i < names.size(); i++) {
            System.out.println("name no " + (i + 1) + ": " + names.get(i));
        }
    }
}