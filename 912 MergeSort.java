class Solution {

    void merge(int[]nums, int mid, int start, int end){
     int left =start,right=mid+1,i=0;
     int[]temp = new int[end-start+1];
     while(left<=mid && right<=end){
        if(nums[left]<=nums[right]){
            temp[i] = nums[left];
            left++;
        }
    else if(nums[right]<=nums[end]){
        temp[i] = nums[right];
        right++;
    }
    i++;
     }

     while(left<=mid){
        temp[i] = nums[left];
        left++;
        i++;
     }
     while(right<=end){
        temp[i] = nums[right];
        right++;
        i++;
     }
     i=0;
     while(start<=end)
     {
        nums[start] = temp[i];
        start++;
        i++;
     }
    }

    void mergesort(int[]nums, int start , int end){
        if(start == end){
            return ;
        }
        int mid = start+(end-start)/2;
        mergesort(nums,start,mid);
        mergesort(nums,mid+1,end);
        merge(nums,mid,start,end);
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;

    }
}
