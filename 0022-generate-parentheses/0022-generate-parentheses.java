class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        backtrack(current , 0 , 0 , n , result);
        return result;
        
    }

    private void backtrack (
        StringBuilder current , 
        int open ,
        int close ,
        int n ,
        List<String> result){

            if ( open == n && close == n ){
                result.add(current.toString());
                return ;
            }

            // open < n 

            if ( open < n ){
                current.append('(');

                backtrack (current , open + 1 , close , n , result );
                current.deleteCharAt(current.length()-1);
            }

            // close < open 

            if ( close < open){
                current.append(')');
                backtrack( current , open , close + 1  , n , result);
                current.deleteCharAt(current.length()-1);
            }

        }
    
}