class Solution {
    public int findMin(int[] nums) {
        if(nums[0] < nums[nums.length - 1]){
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left < right){
            mid = (left + right) / 2;
            if(nums[mid + 1] < nums[mid]){
                return nums[mid + 1];
            }
            else if (nums[mid] > nums[left]){
                left = mid;
            }
            else{right = mid;}

        }
        return nums[mid];
    }
}