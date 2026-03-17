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
    public static void main(String[] args) {
        // String str = "({})[]"; 
        // System.out.println(isValid(str));


        // duplicate parantheses
        String str = "(a+b)";
        System.out.println(hasDup(str));
    }
}
