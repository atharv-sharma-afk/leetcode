class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operator= "+-*/";

        for(String token:tokens){
            if(operator.indexOf(token)!=-1){
                int d2 = stack.pop();
                int d1 = stack.pop();
                int res= 0;
                if(token.equals("+")){
                    res= d1+d2;
                }else if(token.equals("-"))
                    res = d1-d2;

                else if(token.equals("*"))
                    res = d1*d2;

                else if(token.equals("/"))
                    res = d1/d2;
                stack.push(res);    

                
            }
            else
                stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    
}
}

// import java.util.Stack;

// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack = new Stack<>();
        
//         for (String token : tokens) {
//             switch (token) {
//                 case "+":
//                     int b = stack.pop();
//                     int a = stack.pop();
//                     stack.push(a + b);
//                     break;
//                 case "-":
//                     int d = stack.pop();
//                     int c = stack.pop();
//                     stack.push(c - d);
//                     break;
//                 case "*":
//                     int f = stack.pop();
//                     int e = stack.pop();
//                     stack.push(e * f);
//                     break;
//                 case "/":
//                     int h = stack.pop();
//                     int g = stack.pop();
//                     stack.push(g / h);
//                     break;
//                 default:
//                     stack.push(Integer.parseInt(token));
//                     break;
//             }
//         }
        
//         return stack.pop();
//     }
// }