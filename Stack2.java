import java.util.Stack;

public class Stack2 {

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
     if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']') ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
if(s.isEmpty()){
    return true;
}else{
    return false;
}
    }

    public static boolean hasDup(String str){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                int count = 0;

                while(stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                stack.pop();

                if(count == 0){
                    return true;
                }
            }else{
                stack.push(ch);
            }
        }
        return false;
    }
    public static int largRect(int height[]){
        Stack <Integer> stack = new Stack<>();
        int maxArea = 0;
        int nsr[] = new int[height.length];
        int nsl[] = new int[height.length];
for(int i = height.length-1; i>=0; i--){
    while(!stack.isEmpty() && height[stack.peek()] >= height[i]){
        stack.pop();
    }
    if(stack.isEmpty()){
nsr[i] = height.length;
    }else{
nsr[i] = stack.peek();
    }
    stack.push(i);
}


// next smaller left 
stack = new Stack<>();

for(int i = 0; i<height.length; i++){
    while(!stack.isEmpty() && height[stack.peek()] >= height[i]){
        stack.pop();
    }
    if(stack.isEmpty()){
        nsl[i] = -1;
    }else{
        nsl[i] = stack.peek();
    }
    stack.push(i);
}


// curr area 
for(int i = 0; i<height.length; i++){
    int arr = height[i];
int width = nsr[i] - nsl[i] -1;
int currArea  = arr*width;
maxArea = Math.max(currArea, maxArea);
}

return maxArea;
    }
    public static void main(String[] args) {
        // String str = "({})[]"; 
        // System.out.println(isValid(str));


        // // duplicate parantheses
        // String str = "(a+b)";
        // System.out.println(hasDup(str));

        // max area in historgram
        int height[] = {2,1,5,6,2,3};

        int result = largRect(height);
        System.out.println(result);
    }
}
