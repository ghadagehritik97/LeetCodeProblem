package src;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPosInArray {

    public static void main(String[] args) {
        int nums[]={5,7,7,6,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,8)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int []ans= {-1,-1};

        ans[0]=findPosition(nums,target,true);
        if(ans[0]!=-1) {
            ans[1] = findPosition(nums, target, false);
        }
        return ans;

    }
    static int findPosition(int []nums,int target,boolean findStart){
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findStart){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
