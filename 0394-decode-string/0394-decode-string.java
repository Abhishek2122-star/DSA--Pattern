class Solution {
    public String decodeString(String s) {

        Stack<Integer> stackcount = new Stack<>();
        Stack<String> stringstack = new Stack<>();

        String current = "";
        int count = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if (Character.isDigit(ch)){
                count = count * 10 + (ch - '0');
            }
            else if (ch == '['){
                stackcount.push(count);
                stringstack.push(current);

                count = 0 ;
                current = "";

            }
            else if ( ch == ']'){
                int repeat = stackcount.pop();
                String previous = stringstack.pop();

                String random = "";
                
                for(int j = 0 ; j < repeat ; j++){
                    random += current ;

                    
                }
                current = previous + random ;

            }else{
                current += ch ;

            }
            
            


        }
        return current ;

    }
}