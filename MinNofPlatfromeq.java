  static int findPlatform(int arr[], int dep[]) {
        // add your code here
        int n = arr.length;
       int pltneed=0,max=0;
       Arrays.sort(arr);
       Arrays.sort(dep);
       
       int i=0,j=0;
       while(i<n&& j<n){
           if(arr[i]<= dep[j]){
               pltneed++;
               i++;
           }
           else{
               pltneed--;
               j++;
           }
           max = Math.max(max,pltneed);
       }
       return max;
    }
