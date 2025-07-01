package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class phone_number {
        public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if(digits.isEmpty()) return output;
        String[] phone_map={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack("",digits,phone_map,output);
        return output;
    }
    private void backtrack(String combination,String next_digits,String[] phone_map,List<String> output){
        if(next_digits.isEmpty()){
            output.add(combination);
            return;
        }else{
            String letters=phone_map[next_digits.charAt(0)-'2'];
            for(char letter:letters.toCharArray()){
                backtrack(combination+letter,next_digits.substring(1),phone_map,output);
            }
        }
    }
}
