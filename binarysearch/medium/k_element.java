package binarysearch.medium;

public class k_element {
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
