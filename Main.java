public class Main {

    public static void main(String[] args) {
        // Test IntegerSorter
        IntegerSorter integerSorter = new IntegerSorter();
        int[] unsortedIntegers = {5, 2, 8, 3, 1};
        int[] sortedIntegers = integerSorter.sortIntegers(unsortedIntegers);
        
        System.out.println("Sorted integers: ");
        for (int num : sortedIntegers) {
            System.out.print(num + " ");
        }
        System.out.println();  // New line after printing sorted integers

        // Test StringSorter
        StringSorter stringSorter = new StringSorter();
        String[] unsortedStrings = {"banana", "apple", "cherry"};
        String[] sortedStrings = stringSorter.sortStrings(unsortedStrings);

        System.out.println("Sorted strings: ");
        for (String str : sortedStrings) {
            System.out.print(str + " ");
        }
    }
}
