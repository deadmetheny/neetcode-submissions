
class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1){
            return false;
        }
        
        Stack<Character> parentheses = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' && !parentheses.empty() && parentheses.peek() == '('){
                parentheses.pop();
            }
            else if(s.charAt(i) == ']' && !parentheses.empty() && parentheses.peek() == '['){
                parentheses.pop();
            }
            else if(s.charAt(i) == '}' && !parentheses.empty() && parentheses.peek() == '{'){
                parentheses.pop();
            }
            else{parentheses.push(s.charAt(i));}
        }

        return parentheses.empty();
        
    }
} 