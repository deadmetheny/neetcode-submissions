class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sol = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                sol.push(sol.pop() + sol.pop());
            }
            else if(tokens[i].equals("*")){
                sol.push(sol.pop() * sol.pop());
            }
            else if(tokens[i].equals("/")){
                int x = sol.pop();
                int y = sol.pop();
                sol.push(y / x);
            }
            else if(tokens[i].equals("-")){
                int x = sol.pop();
                int y = sol.pop();
                sol.push(y - x);
            }
            else{sol.push(Integer.parseInt(tokens[i]));}
        }
        return sol.peek();
    }
}