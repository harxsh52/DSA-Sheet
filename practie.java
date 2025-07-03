import java.util.*;
public class practie{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int k=sc.nextInt();
    int t=check(arr,k);
    System.out.println(t);
    
}
public static int check(int[] arr,int k){
    if(k==1) return 1;
    Set<Integer> set = new HashSet<>();
    int result=Integer.MAX_VALUE;
    int[] pair=new int[2];
    List<int []> pairs = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        if(!set.contains(arr[i])){
            set.add(arr[i]);
            pair[0]=arr[i];
            pair[1]=i+1;
            pairs.add(new int[]{pair[0], pair[1]});
        }
    }
    Collections.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));
    for(int i=0;i<pairs.size()-k+1;i++){
        int max= pairs.get(i)[1];
        int count=1;
        for(int j=i+1;j<k+i;j++){
            if(pairs.get(j-1)[0]+1 == pairs.get(j)[0]) {
                count++;
                max = Math.max(max, pairs.get(j)[1]);

            }else{
                break;
            }
        }
        if(count==k){
            result = Math.min(result, max);
        }
    }
    return result == Integer.MAX_VALUE ?arr.length:result;
}
}