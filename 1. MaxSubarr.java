https://leetcode.com/problems/maximum-subarray/

class Solution {
    public int maxSubArray(int[] nums) {
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;

        if (nums.length != 0) {

            for (int i = 0; i < nums.length; i++) {
                CurrSum += nums[i];

                if (nums.length == 1) {
                    return nums[i];
                }

                if (CurrSum > MaxSum || CurrSum == MaxSum) {
                    MaxSum = CurrSum;
                }
                if (CurrSum <= 0) {
                    CurrSum = 0;
                }

            }

        }

        return MaxSum;
    }

    }
