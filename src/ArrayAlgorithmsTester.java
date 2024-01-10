import java.util.Arrays;
public class ArrayAlgorithmsTester
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.printExclamation(words);
        System.out.println("----");
        // original word list NOT modified
        System.out.println(Arrays.toString(words));

        System.out.println();

        String[] words1 = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.addExclamation(words1);
        // original word list IS modified
        System.out.println(Arrays.toString(words1));

        System.out.println();

        int[] nums = {6, 4, 0, 3, 9, -2, 5};
        int sum = ArrayAlgorithms.sum(nums);
        System.out.println(sum);
        System.out.println("----");
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));

        System.out.println();

        int[] nums1 = {6, 4, 0, 3, 9};
        double avg = ArrayAlgorithms.average(nums1);
        System.out.println(avg);
        int[] nums2 = {4, 6, 7};
        double avg2 = ArrayAlgorithms.average(nums2);
        System.out.println(avg2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        System.out.println();

        int[] nums3 = {6, 4, 3, 9, 2, 5};
        int min = ArrayAlgorithms.minimum(nums3);
        System.out.println(min);
        int[] nums4 = {-4, 5, -7, 3};
        int min2 = ArrayAlgorithms.minimum(nums4);
        System.out.println(min2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));

        System.out.println();

        int[] nums5 = {6, 4, 3, 9, 2, 5};
        int max = ArrayAlgorithms.maximum(nums5);
        System.out.println(max);
        int[] nums6 = {-8, -3, -7, -10};
        int max2 = ArrayAlgorithms.maximum(nums6);
        System.out.println(max2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums5));
        System.out.println(Arrays.toString(nums6));

        System.out.println();

        int[] nums7 = {5, 10, 15, 12, 2, 6};
        ArrayAlgorithms.multiplyBy(nums7, 6);
        // original numbers list IS modified
        System.out.println(Arrays.toString(nums7));

        System.out.println();

        int[] nums8 = {5, -10, 8, 12, 2, -6, 0};
        int[] squares = ArrayAlgorithms.squares(nums8);
        System.out.println(Arrays.toString(squares));
        System.out.println("----");
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums8));

        System.out.println();

        boolean[] bools = {false, true, true, false, true};
        ArrayAlgorithms.flipBool(bools);
        // original boolean list IS modified
        System.out.println(Arrays.toString(bools));

        System.out.println();

        int[] nums9 = {5, -10, 8, 12, 2, -6, 0};
        System.out.println(ArrayAlgorithms.customToString(nums9));
        int[] nums10 = {15};
        System.out.println(ArrayAlgorithms.customToString(nums10));
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums9));
        System.out.println(Arrays.toString(nums10));

        System.out.println();

        String[] strings = {"hello", "hola", "hi", "apple", "why?"};
        System.out.println(ArrayAlgorithms.longestString(strings));
        // original array NOT modified
        System.out.println(Arrays.toString(strings));
        System.out.println("----");
        String[] strings2 = {"cut", "boy", "mom", "she"};
        System.out.println(ArrayAlgorithms.longestString(strings2));
        // original array NOT modified
        System.out.println(Arrays.toString(strings2));
        System.out.println("----");
        String[] strings3 = {"M", "DA", "B", "FAD"};
        System.out.println(ArrayAlgorithms.longestString(strings3));
        // original array NOT modified
        System.out.println(Arrays.toString(strings3));

        System.out.println();

        String[] words2 = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.makeUppercase(words2);
        // original word list IS modified
        System.out.println(Arrays.toString(words2));
    }
}