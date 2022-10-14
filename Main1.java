public class Main1 {

    public static void main(String[] args) {

        Solution1 sol = new Solution1();
        int[] nums1 = {1, 2, 3, 1};  // should be true
        int[] nums2 = {1, 2, 3, 4};  // should be false
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};  // should be true
        System.out.println(sol.containsDuplicates(nums1));
        System.out.println(sol.containsDuplicates(nums2));
        System.out.println(sol.containsDuplicates(nums3));

    }

}