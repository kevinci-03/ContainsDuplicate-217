import java.util.*;

public class Solution1 {

    public boolean containsDuplicates(int[] nums) {  // Time: O(n)  Space: O(n)

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;

    }

}