public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i ++) {

            if (map.containsKey(target - nums[i])) {
                answer[0] = map.get(target - nums[i]);
                answer[1] = i;
                return answer;
            }

            map.put(nums[i], i);
        }

        
        return answer;
    }
}