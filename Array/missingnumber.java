package Array;

public class missingnumber {
    public int missingNumber(int[] nums) {
        //  int missingNum=0;
        // HashMap<Integer,Integer> original=new HashMap<>();
        // for (int i = 0; i <= nums.length; i++) {
        //     original.put(i,1);
        // }
        // for (int num:nums){
        //      original.put(num, original.get(num)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry:original.entrySet()){
        //     if(entry.getValue()==1){
        //         missingNum=entry.getKey();
        //     }
        // }
        // return missingNum;


    //---------------------------------------

    // Arrays.sort(nums);
    // if(nums[0]!=0){
    //     return 0;
    // }
    // if(nums[0]==0 && nums.length==1){
    //     return 1;
    // }
    
    // for(int i=0;i<nums.length-1;i++){

    //     if(nums[i]+1 != nums[i+1]){
    //         return nums[i]+1;
    //     }
    //      if(i+1==nums.length-1){
    //         return nums[i+1]+1;
    //     }
    // }
      
    //   return -1;

    //-----------------------------

    
    int n=nums.length;
    int xorLength=n;

    for(int i=0;i<n;i++){
        xorLength^=nums[i];
    }

     for(int i=0;i<n;i++){
        xorLength^=i;
    }

    return xorLength;

    }
}

