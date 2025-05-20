package binarysearch.hard;

public class median_of _two _sorted {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int t=nums1.length+nums2.length;
        if(t%2==0){
            double r=(double)kthElement(nums1,nums2,t/2);
            double w=(double)kthElement(nums1,nums2,t/2+1);
            return (r+w)/2;
        }else{
            double r=(double)kthElement(nums1,nums2,t/2+1);
            return r;
        }
    }
    public int kthElement(int[] a, int[] b, int k) {
      int i=0,j=0;
      int t=0;
      int r=0;
      while(i<a.length && j<b.length){
        if(a[i]<b[j]){
            t++;
            
            if(t==k){
                return a[i];
            }
            i++;
        }else{
            t++;
            
            if(t==k){
                return b[j];
            }
            j++;
        }
      }
      while(i<a.length){
        t++;
        
        if(t==k){
            return a[i];
        }
        i++;
      }
      while(j<b.length){
        t++;

        if(t==k){
            return b[j];
        }
        j++;
      }
      return -1;
    }
}
