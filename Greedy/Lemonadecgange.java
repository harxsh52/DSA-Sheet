package Greedy;

public class Lemonadecgange {
    public boolean lemonadeChange(int[] bills) {
        int count_5=0,count_10=0;
        for(int bill:bills){
            if(bill==5){
                count_5+=1;
            }else if(bill==10){
                if(count_5>=1){
                count_10+=1;
                count_5-=1;
                }else{
                    return false;
                }
            }else{
                if(count_10>=1 && count_5>=1){
                    count_10-=1;
                    count_5-=1;
                }else if(count_5>=3){
                    count_5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
