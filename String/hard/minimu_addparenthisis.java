package String.hard;

public class minimu_addparenthisis {
    public int minAddToMakeValid(String s) {
        int deletion=0;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                deletion++;
                count=0;
            }
        }
        return count+deletion;
    }

}
