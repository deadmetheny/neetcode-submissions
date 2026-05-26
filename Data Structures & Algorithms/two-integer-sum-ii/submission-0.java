class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sol = {-1, -1};
        int l = 0;
        int r = numbers.length - 1;
        while(l < r){
            if(numbers[l] + numbers[r] == target){
                sol[0] = l + 1;
                sol[1] = r + 1;
                return sol;
            }
            else if(numbers[l] + numbers[r] > target){
                r--;
            }
            else{l++;}
        }
        return sol;

    }
}