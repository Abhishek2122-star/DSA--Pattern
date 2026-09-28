class Solution {
    public int maxDepth(String s) {
        
        int dep = 0 ;
        int maxdep = 0 ;

        for ( char ch : s.toCharArray()){
            if (ch == '('){
                dep++;
                maxdep = Math.max(maxdep , dep);
            }

            if (ch == ')'){
                dep -- ;
            }
        }
        return maxdep ;

    }
}