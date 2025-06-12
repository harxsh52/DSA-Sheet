package stackqueue.striver;

import java.util.Stack;

public class astriodcollission {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        
        for(int a:asteroids){
            boolean destroyed=false;
            while(!stack.isEmpty() && a<0 && stack.peek()>=0){

                if(stack.peek()<-a){
                    stack.pop();
                    continue;
                }else if(stack.peek()==-a){
                    stack.pop();
                }
                destroyed =true;
                break;
            }
            if(!destroyed){
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] res = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
}
