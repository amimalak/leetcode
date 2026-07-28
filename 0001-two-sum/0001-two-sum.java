class Solution {
    public int[] twoSum(int[] nums, int target) { //no need to create a new list again
        for(int i =0; i< nums.length; i++){ //finding the index
            for (int j= i + 1; j < nums.length; j ++) //do j=i +1 cuz ur moving along
             if (nums[i]+ nums[j] == target){ //nums[i] means "give me the value at index i
                return new int[]{i, j};
             }
        }
          return new int[]{}; //ex new int[5]adds 5 new ints to ur array
    }                           // new int[] creates new list, {} specifies values
   
}


//solution is o(n)^2 cuz ur using 2 for loops , takes a while to iterate 

//Can we do it faster? 