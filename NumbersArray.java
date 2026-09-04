import java.util.*;

public class NumbersArray {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,1,5};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input)));       
        
        System.out.println();

        input = new Integer[] {1,2,3,4,1,2,5,3};

        System.out.println("Input : " + Arrays.toString(input));
        System.out.println("Max number : " + findMax(input));
        System.out.println("Duplicate numbers : " + Arrays.toString(findDuplicates(input)));
        System.out.println("Unique numbers : " + Arrays.toString(findUnique(input))); 
    }

    // Write your methods here
    public static int findMax(Integer[] input) {
        if (input == null) return -1;

        int max = 0;
        for (int n : input) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
        if (input == null) return null;

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        for (Integer num : input) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates.toArray(new Integer[0]);
    }

    public static Integer[] findUnique(Integer[] input) {
        if (input == null) return null;

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer num : input) {
            if (!unique.contains(num)) {
                unique.add(num);
            } else {
                unique.remove(num);
            }
        }

        return unique.toArray(new Integer[0]);
    }
    
}

