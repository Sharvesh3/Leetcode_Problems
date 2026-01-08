class Solution {
    public int[] searchRange(int[] nums, int target) {
                int left = findLeft(nums, target);
        int right = findRight(nums, target);

        if (left <= right) {
            return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }
    public int findLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    public int findRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}