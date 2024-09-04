class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        
        String pattern = "^[+-]?((\\d+\\.?\\d*)|(\\.\\d+))([eE][+-]?\\d+)?$";
       
        return s.matches(pattern);
    }
}