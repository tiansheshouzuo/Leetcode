import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,2,4,5};
        int target=2;
        int[] res=new int[2];
        res=searchRange(nums,target);
        System.out.println(Arrays.toString(res));
    }

        public static int[] searchRange(int[] nums, int target) {
            if(nums.length==0 || nums==null) {
                return new int[]{-1,-1};
            }
            return new int[]{countLeft(nums,target),countRight(nums,target)};
        }
        public static int countLeft(int[] nums, int target) {
            int left=0;
            int right=nums.length;
            while(left<right) {
                int mid=(left+right)/2;
                if(nums[mid]==target) {
                    right=mid;
                }
                else if(target<nums[mid]) {
                    right=mid;
                }
                else if(target>nums[mid]) {
                    left=mid+1;
                }
            }
            if(left==nums.length) {
                return -1;
            }
            return nums[left]==target?left:-1;
        }

        public static int countRight(int[] nums, int target) {
            int left=0;
            int right=nums.length;
            while(left<right) {
                int mid=(left+right)/2;
                if(nums[mid]==target) {
                    left=mid+1;
                }
                else if(target<nums[mid]) {
                    right=mid;
                }
                else if(target>nums[mid]) {
                    left=mid+1;
                }
            }
            if(left==0) {
                return -1;
            }
            return nums[left-1]==target?(left-1):-1;

        }

}
