 vector<int> applyOperations(vector<int>& nums) {
        int n  = nums.size();
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        vector<int>temp;
       for(int num:nums){
        if(num!=0){
            temp.push_back(num);
        }
       }

       while(temp.size()<n){
        temp.push_back(0);
       }


        return temp;
        
    }
