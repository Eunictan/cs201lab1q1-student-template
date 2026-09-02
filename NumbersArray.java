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
        int max = 0;
        for (int n : input) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static Integer[] findDuplicates(Integer[] input) {
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
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        for (Integer n : input) {
            countMap.merge(n, 1, Integer::sum);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }

        return result.toArray(new Integer[0]);
    }
    
}

