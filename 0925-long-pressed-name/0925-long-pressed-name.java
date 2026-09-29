class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int a = 0 ; 
        int b = 0 ;

        while ( b < typed.length()){
            if ( a < name.length() &&  name.charAt(a) == typed.charAt(b)){

                a ++ ;
                b ++ ;

            }
            else if ( b > 0 && typed.charAt(b) == typed.charAt(b-1)){
                b ++ ;
            }
            else {
                return false ;
            }
        }
        return a == name.length();
    }
}