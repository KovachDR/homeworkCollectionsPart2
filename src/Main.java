import java.util.*;

public class Main {
    private final static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private final static List<String> words = new ArrayList<>(List.of("ab","abc","abcd","ab","abc","ab"));
    private final static List<String> strings = new ArrayList<>(List.of("один","один","два","два","два","три","три","три"));
    public static void main(String[] args) {
        task1(nums);
        System.out.println("-----------------");
        task2(nums);
        System.out.println("-----------------");
        task3(words);
        System.out.println("-----------------");
        task4(strings);
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        Collections.sort(nums);
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void task3(List<String> words) {
    Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : strings) {
            if (wordsMap.containsKey(word)) {
                int count = wordsMap.get(word) + 1;
                wordsMap.put(word, count);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println(wordsMap);
    }

}
