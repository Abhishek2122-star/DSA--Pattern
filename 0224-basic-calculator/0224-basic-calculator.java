class Solution {
    public int calculate(String s) {
        
        Stack < Integer> stack = new Stack<>();

        int result = 0 ;
        int number = 0 ;
        int symbol = 1 ;

        for ( int i = 0 ; i < s.length() ; i++ ){

            char ch = s.charAt(i);

            if (Character .isDigit(ch)){
                number = number * 10 + (ch - '0');

            }else if ( ch == '+'){
                result += symbol * number ;
                number = 0 ;
                symbol = 1 ;

            }else if ( ch == '-'){
                result += symbol * number ;
                number = 0 ;
                symbol = -1 ;

            }else if ( ch == '('){
                stack.push (result);
                stack.push(symbol);
                result = 0;
                symbol = 1;

            }else if ( ch == ')'){
                result += symbol * number ;
                number = 0 ;

                result *= stack.pop ();
                result += stack.pop();

            }           

        }
        return result + symbol * number ;



    }
}