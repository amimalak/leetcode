class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> value = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (value.containsKey(nums[i])) {
                int previousIndex = value.get(nums[i]);

                if (i - previousIndex <= k) {
                    return true;
                }
            }

            value.put(nums[i], i);
        }

        return false;
    }
}

//follow code in end to test 