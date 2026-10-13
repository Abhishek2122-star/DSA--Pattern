class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();

        if(digits.isEmpty()){
            return result ;
        }

        String[] dial = {
            "" , "" , "abc" , "def" , "ghi" , "jkl" , 
            "mno" , "pqrs" , "tuv" , "wxyz" 
        };

        backtrack(0, digits, dial, new StringBuilder(), result);

        return result ;
    }

    private void backtrack(

        int index ,
        String digits , 
        String [] dial ,
        StringBuilder path,
        List<String> result ){

            // base 

            if ( index == digits.length()){
                result.add(path.toString());
                return ;
            }

            String lett = dial[digits.charAt(index) - '0'];

            for ( char ch : lett.toCharArray()){

                path.append(ch) ;

                backtrack (index + 1 , digits , dial , path , result );

                path.deleteCharAt(path.length() - 1);

            }
        }
    

}