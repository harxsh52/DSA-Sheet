package Array;

public class liner {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
    for(int i=0;i<nums.length;i++){
      if(target==nums[i]){
        return i;
      }
    }
    return -1;
    }
}

